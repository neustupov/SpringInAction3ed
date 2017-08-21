package ru.neustupov.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void takeSeats(){
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones(){
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud(){
        System.out.println("CLAP CLAP CLAP");
    }

    public void demandRefund(){
        System.out.println("Boo! We want our money back!");
    }

    public void watchPerfomance(ProceedingJoinPoint proceedingJoinPoint){

    }

}
