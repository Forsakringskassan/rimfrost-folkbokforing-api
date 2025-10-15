package rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/folkbokf")
@Produces(MediaType.APPLICATION_JSON)
public class FolkbokfResource {

    @GET
    @Path("/{pnr}")
    public boolean getFolkbokf(@PathParam("pnr") String pnr) {
        return true;
    }
}