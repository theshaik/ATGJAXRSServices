package com.demo.restresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.demo.model.User;

import atg.nucleus.GenericService;
import atg.service.jaxrs.RepresentationModel;
import atg.service.jaxrs.RestException;
import atg.service.jaxrs.annotation.Endpoint;
import atg.service.jaxrs.annotation.RestResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestResource(id = "com.demo.restresource")
@Api(value = "Demo Endpoints")
@Path("/demo")
public class UserRestResource extends GenericService {

	@GET
	@Path(value = "/users/{userId}")
	@Endpoint(id = "/demo/users/{userId}#GET", isSingular=true, filterId="demo.user-default")
	@ApiOperation(value = "Returns a specific user's details.")
	public RepresentationModel getUser(@ApiParam(required = true) @PathParam(value = "userId") String pUserId) throws RestException {
		if (this.isLoggingInfo()) {
			this.logInfo("Entered getUser endpoint, user Id : " + pUserId);
		}
		User user = new User();
		user.setId(pUserId);
		user.setName("Doe");
		return new RepresentationModel.Builder().state(user).build();
	}
}