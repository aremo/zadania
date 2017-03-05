package pl.javastart.springexample.factory;

import org.springframework.stereotype.Component;

@Component
public interface MessageFactory {
    String getMessage();
}
