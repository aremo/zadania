package pl.javastart.springexample.decorators;

import org.springframework.stereotype.Component;

@Component
public class UppercaseDecorator implements MessageDecorator {
    @Override public String decorate (String input){
        return input.toUpperCase();
    }
}
