package com.demo;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;

@ManagedBean(name = "user")
@RequestScoped
public class User implements Serializable {

	/**
	*
	*/
	private static final long serialVersionUID = -2653055197059240828L;
	private static final Logger log = Logger.getLogger(User.class);

	private String firstname;
	private String lastname;

	public User() {

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void newUser() {
		log.info("---------->> Create new user : " + firstname + " " + lastname);
	}

}