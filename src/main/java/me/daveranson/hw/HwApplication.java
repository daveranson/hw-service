package me.daveranson.hw;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.Set;

/**
 * Hello World Application
 *
 * Created by daver on 21/03/2017.
 */
@ApplicationPath("hw-app")
public class HwApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return Collections.singleton(HelloWorldService.class);
    }
}
