package web_app.rest.resource;

import ticket_business.manager.ManagerFactory;

public abstract class AbstractResource {
	
	
	
	private static ManagerFactory managerFactory;
	
	
	public  static void setManagerFactory (ManagerFactory managerFactory1){
		managerFactory  = managerFactory1;
	}
	
	protected static ManagerFactory getManagerFactory(){
		return managerFactory;
	}

}
