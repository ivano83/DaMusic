package it.fivano.damusic.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("test")
public class ReleaseListService {

	@GET
    @Path("{name}")
    public String test(@PathParam("name") String name) {
        return "Ciao " + name.toUpperCase();
    }
	
	
}
