package web_app.rest.resource;

import ticket_business.manager.ManagerFactory;
import ticket_business.manager.ManagerFactorySingletonWay;

public abstract class AbstractResource {
	
	
	
	private static ManagerFactory managerFactory;
	
	private static ManagerFactorySingletonWay managerFactorySingletonWay;
	
	
	public static ManagerFactorySingletonWay getManagerFactorySingletonWay() {
		return managerFactorySingletonWay;
	}

	public static void setManagerFactorySingletonWay(ManagerFactorySingletonWay managerFactorySingletonWay) {
		AbstractResource.managerFactorySingletonWay = managerFactorySingletonWay;
	}

	public  static void setManagerFactory (ManagerFactory managerFactory1){
		managerFactory  = managerFactory1;
	}
	
	protected static ManagerFactory getManagerFactory(){
		return managerFactory;
	}

}
