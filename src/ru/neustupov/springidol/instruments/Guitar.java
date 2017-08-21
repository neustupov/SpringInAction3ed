package ru.neustupov.springidol.instruments;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("DRING DRING DRING");
    }
}
