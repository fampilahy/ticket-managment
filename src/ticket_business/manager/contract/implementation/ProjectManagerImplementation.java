package ticket_business.manager.contract.implementation;

import java.util.ArrayList;
import java.util.List;

import ticket_business.manager.contract.ProjectManager;
import ticket_model.model.bean.projet.Projet;
import ticket_model.model.exception.NotFoundException;

public class ProjectManagerImplementation implements ProjectManager{
	 /**
     * Renvoie le projet demandé
     *
     * @param pId l'identifiant du projet
     * @return Le {@link Projet}
     * @throws NotFoundException Si le projet n'est pas trouvé
     */
    @Override
	public Projet getProjet(Integer pId) throws NotFoundException {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        if (pId < 1) {
            throw new NotFoundException("Projet non trouvé : ID=" + pId);
        }
        Projet vProjet = new Projet(pId);
        vProjet.setNom("Projet n°" + pId);
        return vProjet;
    }


    /**
     * Renvoie la liste des {@link Projet}
     *
     * @return List
     */
    @Override
	public List<Projet> getListProjet() {
        // Je n'ai pas encore codé la DAO
        // Je mets juste un code temporaire pour commencer le cours...
        List<Projet> vList = new ArrayList<>();
        for (int vI = 0; vI < 9; vI++) {
            Projet vProjet = new Projet(vI);
            vProjet.setNom("Projet n°" + vI);
            vList.add(vProjet);
        }
        return vList;
    }
}
