package ru.neustupov.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import ru.neustupov.springidol.performers.Contestant;
import ru.neustupov.springidol.performers.GraceousContestant;

@Aspect
public class ContestantIntroducer {

    @DeclareParents(
            value = "ru.neustupov.springidol.performers.Performer+",
            defaultImpl = GraceousContestant.class)
    public static Contestant contestant;

}
