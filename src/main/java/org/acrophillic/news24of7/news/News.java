package org.acrophillic.news24of7.news;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.acrophillic.news24of7.news.model.NewsTO;
import org.acrophillic.news24of7.news.service.NewsManeger;

@Path("/news")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class News {

	NewsManeger newsManeger = new NewsManeger();

	@GET
	// @Produces(MediaType.APPLICATION_XML) // model should contain annotation
	// @Produces(MediaType.APPLICATION_JSON) // pom should contain that dependences
	public List<NewsTO> allNews(@QueryParam("year") int year, @QueryParam("start") int start,	@QueryParam("size") int size) {		
		if(year>0)
			if(start > 0 && size >0)
				return newsManeger.getAllNews(year, start, size);
			else 
				return newsManeger.getAllNews(year);
		else if (start > 0 && size >0)
			return newsManeger.getAllNews(start, size);
		else 
			return newsManeger.getAllNews();
	}

	@POST
	// @Consumes(MediaType.APPLICATION_JSON) //no need method level annotation if
	// class hold that annotation
	// @Produces(MediaType.APPLICATION_JSON)
	public NewsTO addNews(NewsTO newsTO) {
		NewsTO to = newsManeger.addNews(newsTO);
		return to;
	}

	@GET
	@Path("/{id}")
	// @Produces(MediaType.APPLICATION_XML) //no need method level annotation if
	// class hold that annotation
	// @Produces(MediaType.APPLICATION_JSON)
	public NewsTO news(@PathParam("id") int id) {
		return newsManeger.getNewsById(id);
	}

	@PUT
	@Path("/{id}")
	public NewsTO updateNews(@PathParam("id") int id, NewsTO newsTO) {
		newsTO.setId(id);
		return newsManeger.updateNews(newsTO);
	}

	@DELETE
	@Path("/{id}")
	public void deleteNews(@PathParam("id") int id) {
		newsManeger.deleteNews(id);
	}

}
