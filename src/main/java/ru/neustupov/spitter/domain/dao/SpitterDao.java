package ru.neustupov.spitter.domain.dao;

public interface SpitterDao {
    void addSpitter(Spitter spitter);

    Spitter getSpitterById(long id);

    void saveSpitter(Spitter spitter);
}
