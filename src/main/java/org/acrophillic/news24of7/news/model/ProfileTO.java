package org.acrophillic.news24of7.news.model;

import java.util.Calendar;

public class ProfileTO {

	private int id;
	private String firstName;
	private String secondName;
	private Calendar dathobBirth;
	private Calendar createdOn;
	private String profileName;

	public ProfileTO() {

	}

	public ProfileTO(int id, String profileName, String firstName, String secondName, Calendar dathobBirth, Calendar createdOn) {
		this.id = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.secondName = secondName;
		this.dathobBirth = dathobBirth;
		this.createdOn = createdOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Calendar getDathobBirth() {
		return dathobBirth;
	}

	public void setDathobBirth(Calendar dathobBirth) {
		this.dathobBirth = dathobBirth;
	}

	public Calendar getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "ProfileTO [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", dathobBirth="
				+ dathobBirth + ", createdOn=" + createdOn + ", profileName=" + profileName + "]";
	}
	
	

}
