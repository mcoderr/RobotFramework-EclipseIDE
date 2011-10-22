/**
 * Copyright 2011 Nitor Creations Oy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.otherone.robotframework.eclipse.editor.builder;

import java.util.Collections;
import java.util.List;

import org.otherone.robotframework.eclipse.editor.builder.info.IDynamicParsedString;
import org.otherone.robotframework.eclipse.editor.builder.info.IParsedString;
import org.otherone.robotframework.eclipse.editor.builder.info.IVariableDefinition;

public class VariableDefinition implements IVariableDefinition {

  private IParsedString variable;
  private List<IDynamicParsedString> valuesIMM;

  // singles

  public void setVariable(IParsedString variable) {
    this.variable = variable;
  }

  // lists

  public void setValues(List<IDynamicParsedString> values) {
    this.valuesIMM = Collections.unmodifiableList(values);
  }

  // getters

  @Override
  public IParsedString getVariable() {
    return variable;
  }

  @Override
  public List<IDynamicParsedString> getValues() {
    return valuesIMM;
  }

}
