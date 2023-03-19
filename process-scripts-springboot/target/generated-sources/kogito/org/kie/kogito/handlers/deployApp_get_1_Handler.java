package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@org.springframework.stereotype.Component()
public class deployApp_get_1_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.bam.deployers.services.deployApp service;

    public deployApp_get_1_Handler() {
        this(new org.bam.deployers.services.deployApp());
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    @org.springframework.context.annotation.Lazy()
    public deployApp_get_1_Handler(org.bam.deployers.services.deployApp service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.get((java.lang.String) workItem.getParameter("myBPMN"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.bam.deployers.services.deployApp_get_1_Handler";
    }
}
