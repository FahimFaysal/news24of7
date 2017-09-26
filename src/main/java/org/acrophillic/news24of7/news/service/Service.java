package org.acrophillic.news24of7.news.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.acrophillic.news24of7.news.model.NewsTO;
import org.acrophillic.news24of7.news.model.ProfileTO;

public class Service {

	private static List<NewsTO> newsList = new ArrayList<>();
	private static List<ProfileTO> profileList = new ArrayList<>();

	private static boolean dummyData = true;

	public Service() {

		if (dummyData) { // to check list created single time

			dummyData = false;

			Calendar newCal1 = Calendar.getInstance();
			newCal1.set(2005, 9, 20);
			Calendar newCal2 = Calendar.getInstance();
			newCal2.set(2008, 9, 20);
			Calendar newCal3 = Calendar.getInstance();
			newCal3.set(2017, 9, 20);
			Calendar newCal4 = Calendar.getInstance();
			newCal4.set(2017, 9, 20);
			Calendar newCal5 = Calendar.getInstance();
			newCal5.set(2017, 9, 20);
			Calendar newCal6 = Calendar.getInstance();
			newCal6.set(2017, 9, 20);
			Calendar newCal7 = Calendar.getInstance();
			newCal7.set(1991, 9, 20);
			Calendar newCal8 = Calendar.getInstance();
			newCal8.set(2017, 9, 20);
			Calendar newCal9 = Calendar.getInstance();
			newCal9.set(2017, 9, 20);
			Calendar newCal10 = Calendar.getInstance();
			newCal10.set(2018, 9, 20);

			NewsTO nt1 = new NewsTO(0, "About times", "About times..............", 0, newCal1);
			NewsTO nt2 = new NewsTO(1, "podwer Blue", "Now I hear no sound", 1, newCal2);
			NewsTO nt3 = new NewsTO(0, "Man of fire", "Man of fre.........", 1, newCal3);
			NewsTO nt4 = new NewsTO(1, "Seven pounds", "Seven pounds.........", 1, newCal4);
			NewsTO nt5 = new NewsTO(0, "Tear of sons", "Tear of sons.........", 1, newCal5);
			NewsTO nt6 = new NewsTO(1, "persuits of happiness", "persuits of happiness.........", 1, newCal6);
			NewsTO nt7 = new NewsTO(2, "Blood diamond", "Blood diamond.........", 1, newCal7);
			NewsTO nt8 = new NewsTO(1, "Joly LLB", "Joly LLB.........", 1, newCal8);
			NewsTO nt9 = new NewsTO(2, "Real Steel", "Real Steel.........", 1, newCal9);
			NewsTO nt10 = new NewsTO(1, "The time", "The time.........", 1, newCal10);

			newsList.add(nt1);
			newsList.add(nt2);
			newsList.add(nt3);
			newsList.add(nt4);
			newsList.add(nt5);
			newsList.add(nt6);
			newsList.add(nt7);
			newsList.add(nt8);
			newsList.add(nt9);
			newsList.add(nt10);

			Calendar calendar1 = Calendar.getInstance();
			calendar1.set(1991, 9, 20);
			ProfileTO pto1 = new ProfileTO(0, "Fahim_Faysal", "Fahim", "Faysal", calendar1, Calendar.getInstance());

			Calendar calendar2 = Calendar.getInstance();
			calendar1.set(1990, 5, 5);
			ProfileTO pto2 = new ProfileTO(2, "Abdul_Awal", "Abdul", "Awal", calendar2, Calendar.getInstance());

			Calendar calendar3 = Calendar.getInstance();
			calendar1.set(1992, 5, 20);
			ProfileTO pto3 = new ProfileTO(1, "Ahasan_Habib", "Ahasan", "Habib", calendar3, Calendar.getInstance());

			profileList.add(pto1);
			profileList.add(pto2);
			profileList.add(pto3);
		}

	}

	/* news CRUD */
	public List<NewsTO> getAllNews() {
		return newsList;
	}

	public NewsTO addNews(NewsTO newsTO) {
		newsList.add(newsTO);
		return newsTO;
	}

	public NewsTO updateNews(NewsTO newsTO) {
		newsList.set(newsTO.getId(), newsTO);
		return newsTO;
	}

	public void deleteNews(NewsTO newsTO) {
		newsList.remove(newsTO);
	}

	public void deleteNews(int id) {
		newsList.remove(id);
	}

	/* profile CRUD */

	public List<ProfileTO> getAllProfile() {
		return profileList;
	}

	public ProfileTO getProfileById(int id) {
		return profileList.get(id);
	}

	public ProfileTO addProfile(ProfileTO profileTO) {
		profileTO.setId(profileList.size());
		profileList.add(profileTO);
		return profileTO;
	}

	public ProfileTO updateProfile(ProfileTO profileTO) {
		profileList.set(profileTO.getId(), profileTO);
		return profileTO;
	}

	public void deleteProfile(int id) {
		profileList.remove(id);
	}

}
