package org.example;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/abc")
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(){
        return ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Hello World!";
    }
}
