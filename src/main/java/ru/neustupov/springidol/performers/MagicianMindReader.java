package ru.neustupov.springidol.performers;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class MagicianMindReader implements MindReader{

    private String thoughts;

    @Pointcut("execution(* ru.neustupov.springidol.performers.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){}

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer`s thoughts: " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
