package it.fivano.damusic.core.utils;

import java.util.Comparator;

import it.fivano.damusic.model.ReleaseModel;

public class ReleaseModelComparator implements Comparator<ReleaseModel> {

	@Override
	public int compare(ReleaseModel o1, ReleaseModel o2) {
		if(o1.getPopularLevel() > o2.getPopularLevel())
			return -1;
		if(o1.getPopularLevel() < o2.getPopularLevel())
			return 1;
		if(o1.getPopularLevel() == o2.getPopularLevel()) {
			return o1.getReleaseDate().compareTo(o2.getReleaseDate());
		}
		return 0;
	}



}
