package org.bam.deployers;

import org.bam.deployers.ScriptModel;

public class ScriptProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ScriptModel> {

    public ScriptProcessInstance(org.bam.deployers.ScriptProcess process, ScriptModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ScriptProcessInstance(org.bam.deployers.ScriptProcess process, ScriptModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ScriptProcessInstance(org.bam.deployers.ScriptProcess process, ScriptModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ScriptProcessInstance(org.bam.deployers.ScriptProcess process, ScriptModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ScriptProcessInstance(org.bam.deployers.ScriptProcess process, ScriptModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ScriptModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ScriptModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
