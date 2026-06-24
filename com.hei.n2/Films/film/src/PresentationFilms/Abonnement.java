package PresentationFilms;
import PresentationFilms.TypeAbonnement;

public class Abonnement {
    private double prix;

    public Abonnement(int idAbonnement, TypeAbonnement type) {

        if (type == TypeAbonnement.PREMIUM) this.prix = 15.0;
        else if (type == TypeAbonnement.VIP) this.prix = 15.0;
        else this.prix = 0.0;
    }

    public double getPrix() {
        return this.prix;
    }
}