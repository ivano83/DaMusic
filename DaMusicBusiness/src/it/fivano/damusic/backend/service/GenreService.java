package it.fivano.damusic.backend.service;

import java.util.List;

import it.fivano.damusic.backend.TransformerUtility;
import it.fivano.damusic.backend.dao.GenreMapper;
import it.fivano.damusic.backend.model.Genre;
import it.fivano.damusic.backend.model.GenreExample;
import it.fivano.damusic.exception.BackEndException;
import it.fivano.damusic.model.GenreModel;

public class GenreService extends RootService {

	public GenreService() {
		this.setLogger(getClass());
	}

	private GenreMapper getGenreMapper() throws BackEndException {
		return this.apriSessione().getMapper(GenreMapper.class);
	}

	public List<GenreModel> getGenres() throws BackEndException {

		try {

			GenreMapper gDao = this.getGenreMapper();

			GenreExample ex = new GenreExample();

			List<GenreModel> res = TransformerUtility.transformGenreToModel(gDao.selectByExample(ex));

			return res;


		} finally {
			this.chiudiSessione();
		}
	}

	public GenreModel getGenre(Integer id) throws BackEndException {

		try {

			GenreMapper gDao = this.getGenreMapper();

			GenreExample ex = new GenreExample();
			ex.createCriteria().andIdGenreEqualTo(id);

			GenreModel res = TransformerUtility.transformGenreToModel(gDao.selectByExample(ex).get(0));

			return res;


		} finally {
			this.chiudiSessione();
		}
	}

	public GenreModel getGenreByName(String name) throws BackEndException {

		try {

			GenreMapper gDao = this.getGenreMapper();

			return this.getGenreByName(name, gDao);


		} finally {
			this.chiudiSessione();
		}
	}

	private GenreModel getGenreByName(String name, GenreMapper gDao) throws BackEndException {

		GenreExample ex = new GenreExample();
		ex.createCriteria().andNameEqualTo(name);

		List<GenreModel> res = TransformerUtility.transformGenreToModel(gDao.selectByExample(ex));

		if(res.isEmpty())
			return null;
		else
			return res.get(0);

	}


	public GenreModel saveGenre(GenreModel linkIn) throws BackEndException {

		try {
			Genre genreInsert = TransformerUtility.transformGenre(linkIn);
			GenreMapper gDao = this.getGenreMapper();

			if(linkIn!=null && linkIn.getName()!=null) {

				GenreModel g = this.getGenreByName(linkIn.getName(), gDao);
				if(g!=null) {
					log.info("Il Genere e' gia' presente - ID:"+g.getId()+"  NAME:"+g.getName());
					return g;
				}

				gDao.insert(genreInsert);

			} else {
				throw new BackEndException("Non ci sono dati sufficienti per salvare il genere: "+linkIn);
			}

			return TransformerUtility.transformGenreToModel(genreInsert);

		} finally {
			this.chiudiSessione();
		}

	}


}
