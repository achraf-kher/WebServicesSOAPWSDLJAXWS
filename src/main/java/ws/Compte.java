package ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date dateCreation;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte(int code, Date dateCreation, double solde) {
        this.code = code;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    public Compte() {
    }
}
