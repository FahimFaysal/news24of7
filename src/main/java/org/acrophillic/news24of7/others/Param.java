package org.acrophillic.news24of7.others;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class Param {

	@GET
	@Path("/annotation")
	public String getParamUsingAnnotationDemo(@MatrixParam("matrixParam") String matrixValue, @HeaderParam("headerParam") String headerValue, @CookieParam("cookieParam") String cookieValue) {
		return "MatrixParam :"+matrixValue+", HeaderParam :"+headerValue+", CookieParam: "+ cookieValue;
	}
	
	@GET
	@Path("context")
	public String getParamUsingContextDemo(@Context UriInfo uriInfo, @Context HttpHeaders httpHearders) {
		String path = uriInfo.getAbsolutePath().toString();
		path = path+ "\nCookies:" +httpHearders.getCookies().toString();
		return path;
		
	}

}
