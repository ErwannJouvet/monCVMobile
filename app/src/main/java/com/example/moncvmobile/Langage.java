package com.example.moncvmobile;

public class Langage {
    private String langage;
    private int note;

    public Langage(String langage, int note) {
        this.langage = langage;
        this.note = note;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
