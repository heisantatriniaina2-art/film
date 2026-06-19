package PresentationFilms;

public enum TypeAbonnement{
    STANDARD(10000),
    PREMIUM(20000),
    VIP(30000);

    private final int prix;

    TypeAbonnement(int prix){
        this.prix = prix;
    }
}
