package it.fivano.damusic.backend.service;

import java.util.List;

import it.fivano.damusic.backend.TransformerUtility;
import it.fivano.damusic.backend.dao.PopularKeyMapper;
import it.fivano.damusic.backend.model.PopularKey;
import it.fivano.damusic.backend.model.PopularKeyExample;
import it.fivano.damusic.exception.BackEndException;
import it.fivano.damusic.model.StringKeyModel;

public class PopularKeyService extends RootService {

	public PopularKeyService() {
		this.setLogger(getClass());
	}

	private PopularKeyMapper getPopularKeyMapper() throws BackEndException {
		return this.apriSessione().getMapper(PopularKeyMapper.class);
	}

	public StringKeyModel getStringKeys(Long idUser) throws BackEndException {

		try {

			PopularKeyMapper linkDao = this.getPopularKeyMapper();

			return this.getStringKeys(idUser, linkDao);

		} finally {
			this.chiudiSessione();
		}
	}

	private StringKeyModel getStringKeys(Long idUser, PopularKeyMapper linkDao) throws BackEndException {

			PopularKeyExample input = new PopularKeyExample();
			input.createCriteria().andIdUserEqualTo(idUser);

			List<PopularKey> res = linkDao.selectByExample(input);

			return TransformerUtility.transformPopularKeyToModel(res);

	}

	private PopularKey getStringKey(Long idUser, String key, PopularKeyMapper dao) throws BackEndException {

		PopularKeyExample input = new PopularKeyExample();
		input.createCriteria().andIdUserEqualTo(idUser).andStringKeyEqualTo(key);

		List<PopularKey> res = dao.selectByExample(input);
		if(res!=null && res.size()>0) {
			return res.get(0);
		}

		return null;

	}


	public PopularKey savePopularKey(Long idUser, String key) throws BackEndException {

		try {

			PopularKeyMapper dao = this.getPopularKeyMapper();
			PopularKey p = getStringKey(idUser, key, dao);
			if(p!=null) {
				p.setCountRef(p.getCountRef()+1);
				dao.updateByPrimaryKey(p);
				log.info("string key e' stato aggiornato - KEY:"+p.getStringKey()+"  COUNT:"+p.getCountRef());
			}
			else {
				p = new PopularKey();
				p.setIdUser(idUser);
				p.setStringKey(key);
				p.setCountRef(1);
				dao.insert(p);
				log.info("string key e' stato salvato - KEY:"+p.getStringKey()+"  COUNT:"+p.getCountRef());
			}



			return p;
		} finally {
			this.chiudiSessione();
		}
	}



}
