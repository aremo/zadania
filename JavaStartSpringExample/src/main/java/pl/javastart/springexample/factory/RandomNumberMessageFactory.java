package pl.javastart.springexample.factory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Qualifier("random")
public class RandomNumberMessageFactory implements  MessageFactory {

    @Override
    public String getMessage() {
        Random random = new Random();
        return "Random number " + random.nextInt();
    }
}
