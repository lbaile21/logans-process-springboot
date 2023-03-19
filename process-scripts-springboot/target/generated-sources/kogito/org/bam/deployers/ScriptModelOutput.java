/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bam.deployers;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "script", name = "Script", hidden = true)
public class ScriptModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<ScriptModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "bpmn")
    @javax.validation.Valid()
    private java.lang.String bpmn;

    public java.lang.String getBpmn() {
        return bpmn;
    }

    public void setBpmn(java.lang.String bpmn) {
        this.bpmn = bpmn;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "firstName")
    @javax.validation.Valid()
    private java.lang.String firstName;

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "lastName")
    @javax.validation.Valid()
    private java.lang.String lastName;

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "email")
    @javax.validation.Valid()
    private java.lang.String email;

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    @Override()
    public ScriptModel toModel() {
        ScriptModel result = new ScriptModel();
        result.setId(getId());
        result.setBpmn(getBpmn());
        result.setFirstName(getFirstName());
        result.setLastName(getLastName());
        result.setEmail(getEmail());
        return result;
    }
}
