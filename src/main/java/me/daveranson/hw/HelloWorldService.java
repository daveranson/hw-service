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

    public static final String MESSAGE = "Hello world";

    @GET
    public Response hello() {
        return Response.ok(MESSAGE).build();
    }
}

