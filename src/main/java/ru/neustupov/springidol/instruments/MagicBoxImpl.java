package ru.neustupov.springidol.instruments;

public class MagicBoxImpl implements MagicBox {
    public MagicBoxImpl() {
    }

    @Override
    public String getContents() {
        return "A beautiful assistant";
    }
}
