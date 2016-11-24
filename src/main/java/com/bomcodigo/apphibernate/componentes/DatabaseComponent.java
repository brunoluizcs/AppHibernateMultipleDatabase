package com.bomcodigo.apphibernate.componentes;

import com.bomcodigo.apphibernate.helper.HibernateHelper;
import java.io.Serializable;
import java.util.HashMap;
import javax.enterprise.context.SessionScoped;
import org.hibernate.SessionFactory;

/**
 * Componente de sessão retorna sessões do banco de dados.
 * @author Bruno
 */
@SessionScoped
public class DatabaseComponent implements Serializable{
    private HashMap<String,SessionFactory> factorys;

    public DatabaseComponent() {
        factorys = new HashMap();
    }        

    public HashMap<String, SessionFactory> getFactorys() {
        return factorys;
    }

    public SessionFactory getSessionFactory(String database){        
        SessionFactory mFactory = factorys.getOrDefault(database,null);        
        if (mFactory == null) {
            mFactory = newSessionFactory(database);
            factorys.put(database, mFactory);            
        }        
        return mFactory;
    }
    
    private SessionFactory newSessionFactory(String database){
        HibernateHelper helper = new HibernateHelper(database);
        return helper.getSessionFactory();
    }    
    
}
