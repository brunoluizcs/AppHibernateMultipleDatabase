package com.bomcodigo.apphibernate.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import com.bomcodigo.apphibernate.componentes.DatabaseComponent;
import com.bomcodigo.apphibernate.dao.DaoUsuario;
import com.bomcodigo.apphibernate.entities.Usuario;
import java.util.List;
import javax.inject.Inject;


/**
 * Controla as requisições da Home
 * @author Bruno
 */
@Controller
public class HomeController {

    @Inject private Result result;    
    @Inject private DatabaseComponent databaseComponent; 

    
    @Get("home/{database}")    
    public void home(String database) {           
        DaoUsuario daoUsuario = new DaoUsuario(databaseComponent.getSessionFactory(database));

        List<Usuario> l = daoUsuario.list();
        String msg = "";
        for(Usuario u : l){
            msg += u.getNome() + u.getContato() + "<br>";
        }
        result.include("mensagem",msg);
    }
}
