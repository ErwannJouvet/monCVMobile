package com.example.moncvmobile;

public class Experience {

    private String dateDebut;
    private String dateFin;
    private String Entreprise;
    private String Description;

    public Experience(String dateDebut, String dateFin, String entreprise, String description) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        Entreprise = entreprise;
        Description = description;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getEntreprise() {
        return Entreprise;
    }

    public void setEntreprise(String entreprise) {
        Entreprise = entreprise;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
