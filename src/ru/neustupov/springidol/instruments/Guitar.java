package ru.neustupov.springidol.instruments;

public class Guitar implements Instrument {
    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("DRING DRING DRING");
    }
}
