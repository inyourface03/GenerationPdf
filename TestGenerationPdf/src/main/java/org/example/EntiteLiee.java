package org.example;

public class EntiteLiee {
    private String nomEntite;
    private int nbreActionnaire;
    private String dateCreation;
    private String segment;
    private String secteurActivite;
    private int scd;
    private int reseau;
    private int autres;
    private int total;
    private int coteRisque;
    private String historique;

    public String getNomEntite() {
        return nomEntite;
    }

    public void setNomEntite(String nomEntite) {
        this.nomEntite = nomEntite;
    }

    public int getNbreActionnaire() {
        return nbreActionnaire;
    }

    public void setNbreActionnaire(int nbreActionnaire) {
        this.nbreActionnaire = nbreActionnaire;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public int getScd() {
        return scd;
    }

    public void setScd(int scd) {
        this.scd = scd;
    }

    public int getReseau() {
        return reseau;
    }

    public void setReseau(int reseau) {
        this.reseau = reseau;
    }

    public int getAutres() {
        return autres;
    }

    public void setAutres(int autres) {
        this.autres = autres;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCoteRisque() {
        return coteRisque;
    }

    public void setCoteRisque(int coteRisque) {
        this.coteRisque = coteRisque;
    }

    public String getHistorique() {
        return historique;
    }

    public void setHistorique(String historique) {
        this.historique = historique;
    }
}
