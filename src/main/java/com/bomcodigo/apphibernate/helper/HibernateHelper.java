package com.bomcodigo.apphibernate.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Bruno
 */
public class HibernateHelper {       

    /** 
     * @deprecated Criado para gerenciamento do CDI
     */
    protected HibernateHelper() {
        this(null);
    }    
    
    private SessionFactory sessionFactory;

    public HibernateHelper(String schemaName) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure(String.format("%s.cfg.xml",schemaName)) // configures settings from hibernate.cfg.xml
                    .build();                   
        try {                                    
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Throwable ex) {                        
            StandardServiceRegistryBuilder.destroy(registry);
            throw new ExceptionInInitializerError(ex);
        }        
    }                
    
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
