package me.daveranson.hw;

import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by daver on 21/03/2017.
 */
public class HwApplicationTest {
    Set<Class<?>> classes;

    @Before
    public void setUp()  {
    classes = new  HwApplication().getClasses();
    }

    @Test
    public void testClasses() {
        assertTrue (classes.contains(HelloWorldService.class));
    }

}