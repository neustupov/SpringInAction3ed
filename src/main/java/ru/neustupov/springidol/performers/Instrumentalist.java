package ru.neustupov.springidol.performers;


import org.springframework.stereotype.Component;
import ru.neustupov.springidol.instruments.Instrument;

@Component("eddie")
public abstract class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public String screamSong(){
        return song;
    }

    private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    //public abstract Instrument getInstrument();
}
