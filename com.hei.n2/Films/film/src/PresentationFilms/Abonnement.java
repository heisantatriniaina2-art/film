package PresentationFilms;
import PresentationFilms.TypeAbonnement;
public class Abonnement {
    private TypeAbonnement type; // Gardez le type

    public Abonnement(int idAbonnement, TypeAbonnement type) {
        this.type = type;
    }

    public double getPrix() {
        return this.type.getPrix(); // Utilise directement la méthode de l'enum
    }
}