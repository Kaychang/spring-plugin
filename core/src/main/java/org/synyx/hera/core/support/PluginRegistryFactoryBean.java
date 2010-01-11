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
package org.synyx.hera.core.support;

import org.springframework.beans.factory.FactoryBean;
import org.synyx.hera.core.OrderAwarePluginRegistry;
import org.synyx.hera.core.Plugin;
import org.synyx.hera.core.PluginRegistry;


/**
 * {@link FactoryBean} to create {@link PluginRegistry} instances. Wraps a
 * {@link BeanListFactoryBean}.
 * 
 * @author Oliver Gierke - gierke@synyx.de
 */
public class PluginRegistryFactoryBean<T extends Plugin<S>, S> extends
        AbstractTypeAwareSupport<T> implements FactoryBean {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#getObject()
     */
    public Object getObject() {

        return OrderAwarePluginRegistry.create(getBeans());
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#getObjectType()
     */
    @SuppressWarnings("unchecked")
    public Class getObjectType() {

        return PluginRegistry.class;
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.beans.factory.FactoryBean#isSingleton()
     */
    public boolean isSingleton() {

        return true;
    }
}
