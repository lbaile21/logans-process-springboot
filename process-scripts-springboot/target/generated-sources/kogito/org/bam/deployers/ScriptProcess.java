package org.bam.deployers;

import org.bam.deployers.ScriptModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@org.springframework.stereotype.Component("script")
public class ScriptProcess extends org.kie.kogito.process.impl.AbstractProcess<org.bam.deployers.ScriptModel> {

    public ScriptProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.deployApp_get_1_Handler());
    }

    @org.springframework.beans.factory.annotation.Autowired()
    public ScriptProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.deployApp_get_1_Handler deployApp_get_1_Handler) {
        super(app, java.util.Arrays.asList(deployApp_get_1_Handler), correlations);
        activate();
    }

    public ScriptProcess() {
    }

    @Override()
    public org.bam.deployers.ScriptProcessInstance createInstance(org.bam.deployers.ScriptModel value) {
        return new org.bam.deployers.ScriptProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.bam.deployers.ScriptProcessInstance createInstance(java.lang.String businessKey, org.bam.deployers.ScriptModel value) {
        return new org.bam.deployers.ScriptProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.bam.deployers.ScriptProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.bam.deployers.ScriptModel value) {
        return new org.bam.deployers.ScriptProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.bam.deployers.ScriptModel createModel() {
        return new org.bam.deployers.ScriptModel();
    }

    public org.bam.deployers.ScriptProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.bam.deployers.ScriptModel) value);
    }

    public org.bam.deployers.ScriptProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.bam.deployers.ScriptModel) value);
    }

    public org.bam.deployers.ScriptProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.bam.deployers.ScriptProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.bam.deployers.ScriptProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.bam.deployers.ScriptProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("script", true);
        factory.variable("bpmn", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("firstName", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("lastName", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("email", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.name("script");
        factory.packageName("org.bam.deployers");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode1 = factory.workItemNode(1);
        workItemNode1.name("Service Task");
        workItemNode1.workName("org.bam.deployers.services.deployApp_get_1_Handler");
        workItemNode1.workParameter("NodeName", "Service Task");
        workItemNode1.workParameter("Interface", "org.bam.deployers.services.deployApp");
        workItemNode1.workParameter("Operation", "get");
        workItemNode1.workParameter("interfaceImplementationRef", "org.bam.deployers.services.deployApp");
        workItemNode1.workParameter("operationImplementationRef", "get");
        workItemNode1.workParameter("implementation", "Java");
        workItemNode1.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("bpmn", "bpmn", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A61A6057-47A1-454A-AFFC-E76337A0423B_myBPMNInputX", "myBPMN", "String", null), null, null));
        workItemNode1.done();
        workItemNode1.metaData("UniqueId", "_A61A6057-47A1-454A-AFFC-E76337A0423B");
        workItemNode1.metaData("Implementation", "Java");
        workItemNode1.metaData("elementname", "Service Task");
        workItemNode1.metaData("Type", "Service Task");
        workItemNode1.metaData("OperationRef", "_A61A6057-47A1-454A-AFFC-E76337A0423B_ServiceOperation");
        workItemNode1.metaData("x", 948);
        workItemNode1.metaData("width", 154);
        workItemNode1.metaData("y", 141);
        workItemNode1.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End Process");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_CFA059DC-2FC1-4151-A3EC-990F0B4E3236");
        endNode2.metaData("elementname", "End Process");
        endNode2.metaData("x", 1176);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 164);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("StartProcess");
        startNode3.interrupting(false);
        startNode3.metaData("UniqueId", "_D02D169A-0CF1-4276-93FC-96FD33057A83");
        startNode3.metaData("elementname", "StartProcess");
        startNode3.metaData("x", 363);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 164);
        startNode3.metaData("height", 56);
        startNode3.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode4 = factory.actionNode(4);
        actionNode4.name("Output BPMN");
        actionNode4.action(kcontext -> {
            java.lang.String bpmn = (java.lang.String) kcontext.getVariable("bpmn");
            java.lang.String firstName = (java.lang.String) kcontext.getVariable("firstName");
            java.lang.String lastName = (java.lang.String) kcontext.getVariable("lastName");
            System.out.println("Hey " + firstName + " " + lastName + " " + "here is your BPMN: " + bpmn);
        });
        actionNode4.metaData("UniqueId", "_8E2E0452-86B3-4B86-B8A1-CE3B78B0B2EC");
        actionNode4.metaData("elementname", "Output BPMN");
        actionNode4.metaData("Documentation", "Recieved BPMN via HTTP");
        actionNode4.metaData("NodeType", "ScriptTask");
        actionNode4.metaData("x", 499);
        actionNode4.metaData("width", 154);
        actionNode4.metaData("y", 141);
        actionNode4.metaData("height", 102);
        actionNode4.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode5 = factory.actionNode(5);
        actionNode5.name("Update Variables");
        actionNode5.action(kcontext -> {
            java.lang.String bpmn = (java.lang.String) kcontext.getVariable("bpmn");
            java.lang.String firstName = (java.lang.String) kcontext.getVariable("firstName");
            java.lang.String lastName = (java.lang.String) kcontext.getVariable("lastName");
            java.lang.String email = (java.lang.String) kcontext.getVariable("email");
            kcontext.setVariable("bpmn", bpmn);
            kcontext.setVariable("firstName", firstName);
            kcontext.setVariable("lastName", lastName);
            kcontext.setVariable("email", email);
        });
        actionNode5.metaData("UniqueId", "_E96920FB-69BF-4C28-9F65-FC3EFAF29AD9");
        actionNode5.metaData("elementname", "Update Variables");
        actionNode5.metaData("NodeType", "ScriptTask");
        actionNode5.metaData("x", 733);
        actionNode5.metaData("width", 154);
        actionNode5.metaData("y", 141);
        actionNode5.metaData("height", 102);
        actionNode5.done();
        factory.connection(5, 1, "_07D31D75-516F-4658-85C0-3E4E187CB24D");
        factory.connection(1, 2, "_4F724FE4-643E-4DA7-B009-63B96BF6D27D");
        factory.connection(3, 4, "_80DA9F1E-743F-4BAF-BFF3-67DDC905E3B7");
        factory.connection(4, 5, "_B4A85C14-EA42-43CA-9BA2-CB92E32FACF5");
        factory.validate();
        return factory.getProcess();
    }
}
