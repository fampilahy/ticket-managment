package web_app.rest.resource.projet;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ticket_business.manager.ManagerFactorySingletonWay;
import ticket_business.manager.ProjetManager;
import ticket_model.model.bean.projet.Projet;
import ticket_model.model.exception.NotFoundException;


/**
 * Ressource REST pour les {@link Projet}.
 *
 * @author rose
 */
//@Path("/projets")
//@Produces(MediaType.APPLICATION_JSON)
public class ProjetResource {

//    /**
//     * Renvoie le {@link Projet} d'identifiant {@code pId}
//     *
//     * @param pId identifiant du {@link Projet}
//     * @return Le {@link Projet}
//     * @throws NotFoundException Si le {@link Projet} n'a pas été trouvé
//     */
////    @GET
////    @Path("{id}")
//    public Projet get(@PathParam("id") Integer pId) throws NotFoundException {
//        ProjetManager vProjetManager = new ProjetManager();
//        Projet vProjet = vProjetManager.getProjet(pId);
//        return vProjet;
//    }
//
//
//    /**
//     * Renvoie tous les {@link Projet}
//     *
//     * @return List
//     */
////    @GET
//    public List<Projet> get() {
//        ProjetManager vProjetManager = new ProjetManager();
//        List<Projet> vListProjet = vProjetManager.getListProjet();
//        return vListProjet;
//    }
	
	
    /**
     * Renvoie le {@link Projet} d'identifiant {@code pId}
     *
     * @param pId identifiant du {@link Projet}
     * @return Le {@link Projet}
     * @throws NotFoundException Si le {@link Projet} n'a pas été trouvé
     */
//    @GET
//    @Path("{id}")
    public Projet get(@PathParam("id") Integer pId) throws NotFoundException {
        ProjetManager vProjetManager = new ProjetManager();
        Projet vProjet = vProjetManager.getProjet(pId);
        return vProjet;
    }

    private ManagerFactorySingletonWay managerFactory ;

    /**
     * Renvoie tous les {@link Projet}
     *
     * @return List
     */
//    @GET
    public List<Projet> get() {
        ProjetManager vProjetManager = managerFactory.getProjectManager();
        List<Projet> vListProjet = vProjetManager.getListProjet();
        return vListProjet;
    }
}
