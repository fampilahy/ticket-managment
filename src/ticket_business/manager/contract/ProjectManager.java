package ticket_business.manager.contract;

import java.util.ArrayList;
import java.util.List;

import ticket_model.model.bean.projet.Projet;
import ticket_model.model.exception.NotFoundException;

public interface ProjectManager {

	List<Projet> getListProjet();

	Projet getProjet(Integer pId) throws NotFoundException;

}
