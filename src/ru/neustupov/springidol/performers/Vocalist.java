package ru.neustupov.springidol.performers;

public class Vocalist implements Performer{
    public Vocalist() {
    }

    @Override
    public void perform() {
        System.out.println("Singing : " + song);
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong(){
        return song;
    }
}
