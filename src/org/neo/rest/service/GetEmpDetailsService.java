package org.neo.rest.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.neo.rest.model.EmpDetails;
import org.neo.rest.dao.GetEmpDetailsDAO;

@Path("/resource")

public class GetEmpDetailsService {
	@GET
	@Path("/getEmployee/{empcode}")
	// @Produces("application/xml") //to return XML as response
	//@Produces("application/json") // to return JSON
	@Produces(MediaType.APPLICATION_JSON)
	public EmpDetails getEmployee(@PathParam("empcode") String empcode) {

		System.out.println("Inside service controller");
		GetEmpDetailsDAO empDao = new GetEmpDetailsDAO();
		// return Response.ok( empDao.getEmpDetails(empcode) ).build();
		return empDao.getEmpDetails(empcode);
	}

	@GET
	@Path("/getEmployees")
	// @Produces(MediaType.APPLICATION_XML) //to produce XML response
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployees() {

		System.out.println("Inside service controller1");
		GetEmpDetailsDAO empDao = new GetEmpDetailsDAO();
		GenericEntity<List<EmpDetails>> ge = new GenericEntity<List<EmpDetails>>(empDao.getEmployees()) {
		};
		return Response.ok(ge).build();

	}
}
