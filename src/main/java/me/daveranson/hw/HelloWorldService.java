package me.daveranson.hw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Hello World jax-rs service
 *
 * Created by daver on 21/03/2017.
 */
@Path("/hello")
public class HelloWorldService {
    @GET
    public Response hello() {
        String output = "Hello world";
        return Response.ok(output).build();
    }
}

