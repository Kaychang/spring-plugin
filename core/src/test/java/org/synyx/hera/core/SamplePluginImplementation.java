/*
 * Copyright 2008-2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.synyx.hera.core;

/**
 * @author Oliver Gierke - gierke@synyx.de
 */
public class SamplePluginImplementation implements SamplePlugin {

    /*
     * (non-Javadoc)
     * 
     * @see org.synyx.plugin.core.Plugin#supports(java.lang.Object)
     */
    public boolean supports(String delimiter) {

        return "FOO".equals(delimiter);
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.synyx.plugin.core.ISamplePlugin#pluginMethod()
     */
    public void pluginMethod() {

    }
}
