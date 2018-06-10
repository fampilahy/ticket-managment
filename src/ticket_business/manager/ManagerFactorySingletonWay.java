package ticket_business.manager;

public class ManagerFactorySingletonWay {
	
	private ManagerFactorySingletonWay (){
		
	}
	
	private static final ManagerFactorySingletonWay MANAGER_FACTORY = new ManagerFactorySingletonWay();
	
	public ProjetManager getProjectManager(){
		return new ProjetManager();
	}
	
	public TicketManager getTicketManager(){
		return new TicketManager();
	}
	
	
	public static final ManagerFactorySingletonWay getInstance(){
		return MANAGER_FACTORY;
	}
	
}
