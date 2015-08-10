

package org.netbeans.rest.application.config;

import c0645457.java.joggingdatacollection.credentials.Product;
import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author wayne c0645457
 */
@javax.ws.rs.ApplicationPath("")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(c0645457.java.joggingdatacollection.credentials.Product.class);
    }
    
}
