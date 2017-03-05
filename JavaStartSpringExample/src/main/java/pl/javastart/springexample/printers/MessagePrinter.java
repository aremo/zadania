package pl.javastart.springexample.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.springexample.factory.MessageFactory;

@Component
public class MessagePrinter {

    private MessageFactory messageFactory;

    public MessagePrinter(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    public void printMessage() {
        String message = messageFactory.getMessage();
        System.out.println(message);
    }

//    @Autowired //albo constructor albo setter z @Autowired
//    public void setMessageFactory(MessageFactory messageFactory) {
//        this.messageFactory = messageFactory;
//    }
}
