
package PresentationFilms;

import java.time.LocalDate;

public class Client extends Utilisateur {
    public Abonnement abonnement;

    public Client(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance){
        super(idUtilisateur,nomUtilisateur, prenomUtilisateur, email, dateNaissance);
    }


    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void regarder(Contenu media) {
        System.out.println(getNomUtilisateur() + " regarde le média : " + media.getTitre());
        media.incrementePopularite();
    }
}