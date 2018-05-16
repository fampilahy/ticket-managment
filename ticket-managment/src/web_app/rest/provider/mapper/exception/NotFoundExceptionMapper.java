package web_app.rest.provider.mapper.exception;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import ticket_model.model.exception.NotFoundException;


/**
 * {@link ExceptionMapper} pour les {@link NotFoundException}
 *
 * @author rose
 */
//@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

    @Override
    public Response toResponse(NotFoundException pException) {
        return Response.status(Response.Status.NOT_FOUND).entity(pException.getMessage()).build();
    }
}
