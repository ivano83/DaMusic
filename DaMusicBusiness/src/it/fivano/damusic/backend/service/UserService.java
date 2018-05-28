package it.fivano.damusic.backend.service;

import java.util.List;

import it.fivano.damusic.backend.TransformerUtility;
import it.fivano.damusic.backend.dao.UserMapper;
import it.fivano.damusic.backend.model.User;
import it.fivano.damusic.backend.model.UserExample;
import it.fivano.damusic.exception.BackEndException;
import it.fivano.damusic.model.UserModel;

public class UserService extends RootService {

	public UserService() {
		this.setLogger(getClass());
	}

	private UserMapper getUserMapper() throws BackEndException {
		return this.apriSessione().getMapper(UserMapper.class);
	}

	public UserModel getUser(Long id) throws BackEndException {

		try {

			UserMapper uDao = this.getUserMapper();

			UserModel res = TransformerUtility.transformUserToModel(uDao.selectByPrimaryKey(id));

			return res;


		} finally {
			this.chiudiSessione();
		}
	}

	public UserModel getUser(String userName) throws BackEndException {

		try {

			UserMapper uDao = this.getUserMapper();

			UserExample ex = new UserExample();
			ex.createCriteria().andUserNameEqualTo(userName);
			List<User> res = uDao.selectByExample(ex);
			if(res!=null && !res.isEmpty())
				return TransformerUtility.transformUserToModel(res.get(0));
			else
				return null;


		} finally {
			this.chiudiSessione();
		}
	}



}
