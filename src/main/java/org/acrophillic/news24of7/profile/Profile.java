package org.acrophillic.news24of7.profile;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acrophillic.news24of7.news.model.ProfileTO;
import org.acrophillic.news24of7.news.service.ProfileManeger;

@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Profile {

	private ProfileManeger profileManeger = new ProfileManeger();
	private ProfileTO profileTO = new ProfileTO();

	@GET
	public List<ProfileTO> getAllProfiles() {
		return profileManeger.getAllProfile();
	}

	@POST
	@Path("/{id}")
	public ProfileTO getProfileById(@PathParam("id") int id) {
		profileTO.setId(id);	
		return profileManeger.getProfileById(profileTO);
	}
	
	@POST
	public ProfileTO addProfile(ProfileTO profileTO) {
		return profileManeger.addProfile(profileTO);
	}

	@PUT
	@Path("/{id}")
	public ProfileTO updateProfile(@PathParam("id") int id, ProfileTO profileTO) {
		profileTO.setId(id);
		return profileManeger.updateProfile(profileTO);
	}
	
	@DELETE
	@Path("/{id}")
	public void deleteProfile(@PathParam("profileName") String profileName, ProfileTO profileTO) {
		profileTO.setProfileName(profileName);
		profileManeger.deleteProfile(profileTO);
	}

}
