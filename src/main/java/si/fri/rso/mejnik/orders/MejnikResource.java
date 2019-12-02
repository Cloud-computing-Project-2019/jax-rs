package si.fri.rso.mejnik.orders;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("orders")
public class MejnikResource {

    @GET
    public Response getMejnik() {
        return Response.status(Response.Status.OK).entity("{\n" +
                "    \"clani\": [\"gh8590@student.uni-lj.si\"],\n" +
                "    \"opis_projekta\": \"This service contains of just an API in order to pass Mejnik\",\n" +
                "}").build();
    }
}
