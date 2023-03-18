/* */
package main.java.org.bam.deployers.services;

import main.java.org.bam.deployers.springboot.newProjBPMN;
import main.java.org.springframework.stereotype.Component;

@Component
public class deployBPMNService {

    public void deployProj(newProjBPMN newProjBPMN) 
        throws IOException {
            RandomAccessFile stream = new RandomAccessFile(myBPMN, "rw");
            FileChannel channel = stream.getChannel();
            String value = newProjBPMN.getBPMN();
            byte[] strBytes = value.getBytes();
            ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
            buffer.put(strBytes);
            buffer.flip();
            channel.write(buffer);
            stream.close();
            channel.close();
        
            // verify
            RandomAccessFile reader = new RandomAccessFile(myBPMN, "r");
            assertEquals(value, reader.readLine());
            reader.close();
        }
    
}
