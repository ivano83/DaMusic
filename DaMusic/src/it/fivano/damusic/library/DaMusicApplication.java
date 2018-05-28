package it.fivano.damusic.library;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("duws")
public class DaMusicApplication extends ResourceConfig {

	public DaMusicApplication() {
		packages("it.ivano.damusic.service.daws");
	}
}
