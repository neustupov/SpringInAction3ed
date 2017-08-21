package ru.neustupov.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.neustupov.springidol.performers.Juggler;
import ru.neustupov.springidol.performers.Performer;
import ru.neustupov.springidol.performers.PoeticJuggler;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke(){
        return new Juggler();
    }

    @Bean
    public Poem sonnet29(){
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke(){
        return new PoeticJuggler(sonnet29());
    }
}
