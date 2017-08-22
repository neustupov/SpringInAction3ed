package ru.neustupov.springidol;

public aspect JudgeAspect {
    public JudgeAspect() {
    }

    pointcut perfomance() : execution(* perform(..));

    after() returning(): perfomance(){
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
