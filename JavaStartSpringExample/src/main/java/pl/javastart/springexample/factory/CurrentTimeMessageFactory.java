package pl.javastart.springexample.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("time")
public class CurrentTimeMessageFactory implements MessageFactory {

    public String getMessage() {
        return "Current time: " + System.currentTimeMillis();
    }
}

