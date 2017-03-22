package me.daveranson.hw;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.junit.Assert.assertEquals;

/**
 * Created by daver on 22/03/2017.
 */
public class HelloWorldServiceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new HwApplication();
    }

    @Test
    public void test() {
        final String hello = target("hello").request().get(String.class);
        assertEquals(HelloWorldService.MESSAGE, hello);
    }
}
