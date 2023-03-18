package main.java.org.bam.deployers.springboot;

public class newProjBPMN {
    private String firstName;
    private String lastName;
    private String email;
    private String bpmn;

    public newProjBPMN() {

    }

    public newProjBPMN(String firstName, String lastName, String email, String bpmn) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.bpmn = bpmn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBPMN() {
        return bpmn;
    }

    public void setBPMN(String bpmn) {
        this.bpmn = bpmn;
    }


    @Override
    public String toString() {
        return "BPMNProj [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", BPMN=" + bpmn + "]";
    }

}
