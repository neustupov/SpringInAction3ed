package ru.neustupov.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ru/neustupov/springidol/springIdol.xml");
        Performer performer = (Performer)ctx.getBean("poeticDuke");
        performer.perform();
    }
}