package ru.neustupov.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.neustupov.springidol.performers.Performer;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ru/neustupov/springIdol.xml");
        Performer performer = (Performer)ctx.getBean("kenny");
        performer.perform();

        Performer magician = (Performer)ctx.getBean("harry");
        magician.perform();
    }
}
