package ticket_business.manager;

import ticket_business.manager.contract.ProjectManager;

public class ManagerFactory {
	
	private static ProjectManager projectManager;
	
	private static TicketManager ticketManager;
	
	public ProjectManager getProjectManager() {
		return projectManager;
	}
	
	public TicketManager getTicketManager(){
		return ticketManager;
	}


	public void setProjectManager(ProjectManager projectManager) {
		ManagerFactory.projectManager = projectManager;
	}


	public void setTicketManager(TicketManager ticketManager) {
		ManagerFactory.ticketManager = ticketManager;
	}


	

}
