package it.fivano.damusic.core;

import java.io.IOException;

import it.fivano.damusic.conf.GoogleConf;
import it.fivano.damusic.model.LinkModel;
import it.fivano.damusic.model.ReleaseModel;

public class GoogleService extends BaseService {

	private GoogleConf conf;

	public GoogleService() throws IOException {
		conf = new GoogleConf();
		this.setLogger(getClass());
	}

	private String getUrlConnection(ReleaseModel release, int tentativi) {
		// pagina di inizio
		return conf.URL+conf.URL_ACTION+"?"+conf.PARAMS.replace("{0}", release.getNameWithUnderscore());
	}

	public void addManualSearchLink(ReleaseModel release) {

		LinkModel l = new LinkModel();
		l.setLink(this.getUrlConnection(release, 0));
		l.setName("[......CERCA SU GOOGLE......]");
		release.addLink(l);

	}

	protected String applyFilterSearch(String t) {
		return t.replace(" ", "+");
	}

}
