package web_app.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


/**
 * Classe de configuration de l'application REST
 *
 * @author rose
 */
//@ApplicationPath("/")
public class RestApplication extends ResourceConfig {

    /**
     * Constructeur par défaut.
     */
    public RestApplication() {
        packages("web_app.rest");
    }
}
