package ru.neustupov.springidol.performers;

import ru.neustupov.springidol.instruments.MagicBox;

public class Magician implements Performer {
    public Magician() {
    }

    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magic box contains ... ");
        System.out.println(magicBox.getContents());
    }

    private MagicBox magicBox;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    private String magicWords;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
