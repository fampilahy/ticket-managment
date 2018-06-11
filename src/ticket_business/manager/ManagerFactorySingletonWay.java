package ticket_business.manager;

import ticket_business.manager.contract.ProjectManager;
import ticket_business.manager.contract.implementation.ProjectManagerImplementation;

public class ManagerFactorySingletonWay {
	
	private ManagerFactorySingletonWay (){
		
	}
	
	private static final ManagerFactorySingletonWay MANAGER_FACTORY = new ManagerFactorySingletonWay();
	
	
	//note this is not good since each call to this method with create a new ProjectManager 
	public ProjectManager getProjectManager(){
		return new ProjectManagerImplementation();
	}
	
	public TicketManager getTicketManager(){
		return new TicketManager();
	}
	
	
	public static final ManagerFactorySingletonWay getInstance(){
		return MANAGER_FACTORY;
	}
	
}
