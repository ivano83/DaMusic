package it.ivano.damusic.rs.api;

import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import it.fivano.damusic.model.GenreModel;
import it.fivano.damusic.model.LinkModel;
import it.fivano.damusic.model.ReleaseModel;
import it.fivano.damusic.model.TrackModel;

@Path("/release")
public class ReleaseService {
	
	
	@GET
	@Path("{RELEASE_NAME}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ReleaseModel> getRelase(@PathParam("RELEASE_NAME") String releaseName) {
		
		List<ReleaseModel> resList = new ArrayList<>();
		System.out.println("input: "+releaseName);
		
		GenreModel genere = new GenreModel();
		genere.setId(1);
		genere.setName("Dance");
		
		ReleaseModel res = new ReleaseModel();
		res.setNameWithUnderscore("VA-Beat_Therapy_Vol_17_Compilation-(BTR199)-WEB-2018-iHR");
		res.setArtist("VA");
		res.setSong("Beat_Therapy_Vol_17_Compilation");
		res.setCrew("iHR");
		res.setReleaseDate("25/05/2018");
		res.setGenre(genere);
		
		TrackModel tr = new TrackModel();
		tr.setTrackNumber(1);
		tr.setTrackName("Canzone 1");
		res.addTrack(tr);
		
		LinkModel link = new LinkModel();
		link.setLink("http://codingjam.it/webservice-restful-con-jersey/");
		link.setName("http://codingjam.it/webservice-restful...");
		res.addLink(link);
		
		System.out.println("retrieve release: "+res);
		resList.add(res);
		return resList;
	}
	
	

}
