package pl.zajecia.piosenki;

import java.time.LocalDate;

public class Piosenka {
    private long id;
    private String tytul;

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    private int rokProdukcji;

    public Piosenka(long id, String tytul, int rokProdukcji) {
        this.id = id;
        this.tytul = tytul;
        this.rokProdukcji = rokProdukcji;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

}
