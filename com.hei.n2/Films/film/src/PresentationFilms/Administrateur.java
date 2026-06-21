package PresentationFilms;

import java.time.LocalDate;
import java.util.List;

public class Administrateur extends Utilisateur{
    public Administrateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance){
        super(idUtilisateur,nomUtilisateur, prenomUtilisateur, email, dateNaissance);
    }

    public void consulterTopPopulaires(List<Contenu> contenus) {
        for (Contenu c : contenus) {
            System.out.println(c.getTitre() + " (Popularité : " + c.getPopularite() + ")");
        }
    }

    public double consulterRevenus(List<Client> listeClients) {
        double totalRevenus = 0;
        for (Client c : listeClients) {
            if (c.getAbonnement() != null) {
                totalRevenus += c.getAbonnement().getPrix();
            }
        }
        return totalRevenus;
    }
}

