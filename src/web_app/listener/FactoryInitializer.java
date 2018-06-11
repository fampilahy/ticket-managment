package web_app.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;


import ticket_business.manager.ManagerFactory;
import ticket_business.manager.ManagerFactorySingletonWay;
import ticket_business.manager.TicketManager;
import ticket_business.manager.contract.implementation.ProjectManagerImplementation;
import web_app.rest.resource.AbstractResource;

public class FactoryInitializer implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		ManagerFactory managerFactory = new ManagerFactory();
		ManagerFactorySingletonWay managerFactorySingletonWay = ManagerFactorySingletonWay.getInstance();
		
		AbstractResource.setManagerFactory(managerFactory);
		AbstractResource.setManagerFactorySingletonWay(managerFactorySingletonWay);
		
		managerFactory.setProjectManager(new ProjectManagerImplementation());
		managerFactory.setTicketManager(new TicketManager());
		
	}

	

}
