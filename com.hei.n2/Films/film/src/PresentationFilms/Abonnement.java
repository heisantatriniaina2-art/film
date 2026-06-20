package PresentationFilms;

public class Abonnement {
    private int idAbonnement;
    private TypeAbonnement typeAbonnement;

    public Abonnement(int idAbonnement, TypeAbonnement typeAbonnement) {
        this.idAbonnement = idAbonnement;
        this.typeAbonnement = typeAbonnement;
    }

    public int getIdAbonnement() {
        return idAbonnement;
    }

    public TypeAbonnement getTypeAbonnement() {
        return typeAbonnement;
    }

    public double getPrix() {
        return typeAbonnement.getPrix();
    }
}
