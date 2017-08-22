package ru.neustupov.springidol.performers;

public interface MindReader {
    void interceptThoughts(String thoughts);

    String getThoughts();
}
