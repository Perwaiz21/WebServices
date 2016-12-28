package com.tutorialspoint;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

	UserDao userDao = new UserDao();
	private static final String SUCCESS_RESULT = "<result>success</result>";
	private static final String FAILURE_RESULT = "<result>failure</result>";

	/*@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers() {
		return userDao.getAllUsers();
	}*/

	@GET
	@Path("/anotherUsers")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAnotherUsers() {
		return userDao.getAllAnotherUsers();
	}
	
	@PUT
	@Path("/PUTanotherUsers")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getAnotherUsersUpdate() {
		return userDao.getAnotherUsersUpdatePut();
	}


	
}