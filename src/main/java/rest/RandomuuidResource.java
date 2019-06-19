/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import entity.User_1;
import entity.User_1Facade;
import entity.UuidFacade;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jamalahmed
 */
@Path("randomuuid")
public class RandomuuidResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RandomuuidResource
     */
    public RandomuuidResource() {
    }

    /**
     * Retrieves representation of an instance of rest.RandomuuidResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
       return new Gson().toJson(new UuidFacade().getRandomUuid());
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
     @Path("/{timestamp}")
    //@RolesAllowed({"user", "admin"})
    public String withTimeStamp(@PathParam("timestamp") int timeStamp) {
        
        if (timeStamp == 1) {
             return new Gson().toJson(new UuidFacade().getRandomUuidWithTime());
        }
        
        return new Gson().toJson(new UuidFacade().getRandomUuid());
    }
    
     @GET
    @Produces(MediaType.APPLICATION_JSON)
     @Path("/{timestamp}/{count}")
    //@RolesAllowed({"user", "admin"})
    public String withTimeStampAndCount(@PathParam("timestamp") int timeStamp,@PathParam("count") int count) {
        
       if (timeStamp == 1 & count != 0) {
            return new Gson().toJson(new UuidFacade().getRandomUuidWithTimeAndCount(count));
        }
        
            return new Gson().toJson(new UuidFacade().getRandomUuidWithTime());
      
      
        
        
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postUser_1(String user){
        User_1 h = new Gson().fromJson(user, User_1.class); 
        new User_1Facade().PostUser(h);
      
        return Response.ok().entity(new Gson().toJson(h)).build();
                
    }
    /**
     * PUT method for updating or creating an instance of RandomuuidResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}



