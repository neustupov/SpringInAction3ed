package ru.neustupov.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* ru.neustupov.springidol.performers.Performer.perform(..))")

    public void perfomance(){}

    @Before("perfomance()")
    public void takeSeats(){
        System.out.println("The audience is taking their seats");
    }

    @Before("perfomance()")
    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }

    @AfterReturning("perfomance()")
    public void applaud(){
        System.out.println("CLAP CLAP CLAP");
    }

    @AfterThrowing("perfomance()")
    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }

    @Around("perfomance()")
    public void watchPerfomance(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();

            proceedingJoinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP");
            System.out.println("The perfomance took " + (end-start) + "milliseconds");
        }catch (Throwable t){
            System.out.println("Boo! We want our money back!");
        }
    }

}
