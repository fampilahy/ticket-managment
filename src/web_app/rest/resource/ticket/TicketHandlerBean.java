package web_app.rest.resource.ticket;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ManagedBean
@RequestScoped
public class TicketHandlerBean implements Serializable{
	
	private String name;
	
	public TicketHandlerBean() {
		// TODO Auto-generated constructor stub
	}
	
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	



	private static final String NAME_KEY ="name";
	public void forward(){
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext ext = facesContext.getExternalContext();
		HttpServletRequest request = (HttpServletRequest) ext.getRequest();
		
		HttpServletResponse response = (HttpServletResponse) ext.getResponse();
		try {
//			String name = request.getParameter(NAME_KEY).trim();
			request.setAttribute(NAME_KEY, name);
			request.getRequestDispatcher("/tickethandler").forward(request,response);
			facesContext.responseComplete();
		} catch (ServletException | IOException e) {
			Logger.getLogger(TicketHandlerBean.class.getName()).log(Level.SEVERE, e.getMessage(), e);
		}
	}
}
