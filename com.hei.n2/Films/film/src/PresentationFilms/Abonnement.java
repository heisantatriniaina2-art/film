package PresentationFilms;

public class Abonnement {
    private double prix;
    private int idAbonnement;
    private TypeAbonnement typeAbonnement;

    public Abonnement(int idAbonnement, TypeAbonnement type) {

        if (type == TypeAbonnement.PREMIUM) this.prix = 15.0;
        else if (type == TypeAbonnement.VIP) this.prix = 15.0;
        else this.prix = 0.0;
        this.idAbonnement = idAbonnement;
    }

    public double getPrix() {
        return this.prix;
    }

    public int getIdAbonnement() {
        return idAbonnement;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setIdAbonnement(int idAbonnement) {
        this.idAbonnement = idAbonnement;
    }

    @Override
    public String toString() {
        return "Abonnement ID: " + idAbonnement + " | Type: " + typeAbonnement + " | Prix: " + getPrix() + "Ariary";
    }
}