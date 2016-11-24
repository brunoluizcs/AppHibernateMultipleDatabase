package com.bomcodigo.apphibernate.dao;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Data Access Object da classe Usuario
 * @author Bruno
 */
@RequestScoped
public class DaoUsuario {

    SessionFactory sessionFactory;
    
    public DaoUsuario(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }    
    
    public List list(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        
        List result = null;
        result = session.createQuery("from Usuario").list();
        
        session.getTransaction().commit();
        session.close();
        return result;        
    }
    
}
