package ba.unsa.etf.rpr.tutorijal5;

import java.util.ArrayList;

public class Student {
    private final String ime_prezime;
    private final Integer index;
    private Integer ects_bodovi;
    private ArrayList<Predmet> predmeti;

    public Student (String ime_prezime, Integer index){
        this.ime_prezime=ime_prezime;
        this.index=index;
    }
    public String getIme_prezime() {
        return ime_prezime;
    }
    public Integer getIndex() {
        return index;
    }

    public Integer getEcts_bodovi() {
        return ects_bodovi;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void dodajPredmet(Predmet predmet){
        predmeti.add(predmet);
    }
}
