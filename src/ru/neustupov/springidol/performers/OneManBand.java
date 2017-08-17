package ru.neustupov.springidol.performers;

import ru.neustupov.springidol.instruments.Instrument;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() {
        for (String key : instruments.keySet()) {
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }
}
