package it.fivano.damusic.model;

import java.text.ParseException;
import java.util.Comparator;

import it.fivano.damusic.core.utils.DamusicUtility;

public class ReleaseModelDateSort implements Comparator<ReleaseModel> {

	@Override
	public int compare(ReleaseModel o1, ReleaseModel o2) {
		try {
			return DamusicUtility.getStandardDate(o1.getReleaseDate()).compareTo(DamusicUtility.getStandardDate(o2.getReleaseDate()));
		} catch (ParseException e) {
			return 0;
		} catch (NullPointerException e) {
			return 0;
		}
	}



}
