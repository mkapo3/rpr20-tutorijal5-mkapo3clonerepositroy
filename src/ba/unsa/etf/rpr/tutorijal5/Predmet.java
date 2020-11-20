package ba.unsa.etf.rpr.tutorijal5;

import java.util.ArrayList;
import java.util.HashMap;

public class Predmet {
    private final String naziv_predmeta;
    private final Integer predmet_ects_bodovi;
    private final boolean obazveznost;
    private ArrayList<Student> studenti;

    public Predmet(String naziv_predmeta, Integer predmet_ects_bodovi, boolean obazveznost) {
        this.naziv_predmeta = naziv_predmeta;
        this.predmet_ects_bodovi=predmet_ects_bodovi;
        this.obazveznost=obazveznost;
    }
    public String getNaziv_predmeta() {
        return naziv_predmeta;
    }
    public Integer getPredmet_ects_bodovi() {
        return predmet_ects_bodovi;
    }

    public boolean isObazveznost() {
        return obazveznost;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void dodajStudenta(Student student) {
        studenti.add(student);
    }
}
