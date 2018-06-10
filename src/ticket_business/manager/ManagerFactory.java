package ticket_business.manager;

public class ManagerFactory {
	
	private static ProjetManager projectManager;
	
	private static TicketManager ticketManager;
	
	public ProjetManager getProjectManager() {
		return projectManager;
	}
	
	public TicketManager getTicketManager(){
		return ticketManager;
	}


	public void setProjectManager(ProjetManager projectManager) {
		this.projectManager = projectManager;
	}


	public void setTicketManager(TicketManager ticketManager) {
		this.ticketManager = ticketManager;
	}


	

}
