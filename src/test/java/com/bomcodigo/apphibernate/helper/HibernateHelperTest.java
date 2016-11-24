package com.bomcodigo.apphibernate.helper;

import org.hibernate.SessionFactory;
import static org.junit.Assert.*;

/**
 * Testa a classe HibernateHelper
 * @author Bruno
 */
public class HibernateHelperTest {
    
    public HibernateHelperTest() {
    }    


    /**     
     * Deve retornar uma session factory valida
     */
    @org.junit.Test
    public void retornarUmaSessionFactoryValida() {       
        HibernateHelper instance = new HibernateHelper("frequencia");        
        SessionFactory result = instance.getSessionFactory();
        assertNotNull(result);
    }
    
}
