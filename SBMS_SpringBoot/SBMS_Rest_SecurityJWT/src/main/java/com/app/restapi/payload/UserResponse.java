package com.app.restapi.payload;

import lombok.Data;

@Data
public class UserResponse 
{
	
	private String token;
	
	private String notes;
	
	

	public UserResponse() {
		super();
	}
	
	

	public UserResponse(String token, String notes) {
		super();
		this.token = token;
		this.notes = notes;
	}



	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	

}
