package PresentationFilms;

public enum TypeAbonnement{
    STANDARD, PREMIUM,VIP;

    public double getPrix() {
        return switch (this) {
            case VIP -> 20.0;
            case PREMIUM -> 10.0;
            case STANDARD -> 5.0;
        };
    }
}
