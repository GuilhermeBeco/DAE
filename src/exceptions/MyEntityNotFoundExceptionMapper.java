package exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class MyEntityNotFoundExceptionMapper implements ExceptionMapper<MyEntityAlreadyExistsException> {

    @Override
    public Response toResponse(MyEntityAlreadyExistsException e) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
    }
}
