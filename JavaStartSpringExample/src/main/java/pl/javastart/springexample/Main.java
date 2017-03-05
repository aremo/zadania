package pl.javastart.springexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pl.javastart.springexample.factory.CurrentTimeMessageFactory;
import pl.javastart.springexample.printers.MessagePrinter;


@ComponentScan
public class Main {
    public static void main(String[] args) {

        BeanFactory factory = new AnnotationConfigApplicationContext(Main.class);

        MessagePrinter messagePrinter = factory.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
    }
}
