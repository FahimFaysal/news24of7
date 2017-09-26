
package org.acrophillic.news24of7.news.service;

import java.util.List;

import org.acrophillic.news24of7.news.model.ProfileTO;

public class ProfileManeger {
	
	private Service service = new Service();
	
	public List<ProfileTO> getAllProfile(){
		return  service.getAllProfile();
	}
	
	public ProfileTO getProfileById(ProfileTO profileTO) {
		return service.getProfileById(profileTO.getId());
	}
	
	public ProfileTO addProfile(ProfileTO profileTO) {
		service.addProfile(profileTO);
		return profileTO;
	}
	
	public ProfileTO updateProfile(ProfileTO profileTO) {
		service.updateProfile(profileTO);
		return profileTO;
	}
	
	public void deleteProfile(ProfileTO profileTO) {
		service.deleteProfile(profileTO.getId());
	}
}