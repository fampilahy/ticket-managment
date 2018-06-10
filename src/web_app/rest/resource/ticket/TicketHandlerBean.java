package web_app.rest.resource.ticket;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PathParam;

import ticket_business.manager.ManagerFactory;
import ticket_business.manager.ManagerFactorySingletonWay;
import ticket_business.manager.TicketManager;
import ticket_model.model.bean.ticket.Ticket;
import ticket_model.model.exception.NotFoundException;
import web_app.rest.resource.AbstractResource;

@ManagedBean
@RequestScoped
public class TicketHandlerBean extends AbstractResource implements Serializable {

	private String number;
	private ManagerFactorySingletonWay managerFactory = ManagerFactorySingletonWay.getInstance();

	public TicketHandlerBean() {
		// TODO Auto-generated constructor stub
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	// private void init(){
	// this.number = new String();
	// }

//	dependency injection
	public Ticket getTicket(Long pNumero) throws NotFoundException {
		TicketManager vTicketManager =null;
		//first way from a singleton but violation du contrainte D de solid
//		 vTicketManager = managerFactory.getTicketManager();
		
		//second way create
		 vTicketManager = getManagerFactory().getTicketManager();
		
		Ticket vTicket = vTicketManager.getTicket(pNumero);
		return vTicket;
	}

	private static final String NAME_KEY = "name";

	public void forward() {
		// init();

		Long ticketId = null;
		try {
			ticketId = Long.parseLong(number);
		} catch (Exception e) {
			// TODO: handle exception
		}

		Ticket ticket = null;

		if (ticketId != null) {
			try {
				ticket = getTicket(ticketId);
			} catch (NotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FacesMessage facesMessage = new FacesMessage("Ticket " + ticket == null ? "notfound" : ticket.toString());
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null, facesMessage);
		// ExternalContext ext = facesContext.getExternalContext();
		// HttpServletRequest request = (HttpServletRequest) ext.getRequest();
		//
		// HttpServletResponse response = (HttpServletResponse)
		// ext.getResponse();
		// try {
		// String name = request.getParameter(NAME_KEY).trim();
		// request.setAttribute(NAME_KEY, name);
		// request.getRequestDispatcher("/tickethandler").forward(request,response);
		// facesContext.responseComplete();
		// } catch (ServletException | IOException e) {
		// Logger.getLogger(TicketHandlerBean.class.getName()).log(Level.SEVERE,
		// e.getMessage(), e);
		// }
	}
}
