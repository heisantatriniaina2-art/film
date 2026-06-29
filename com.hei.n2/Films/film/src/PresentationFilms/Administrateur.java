package PresentationFilms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<Client> voirAbonneParType(List<Client> listeCLients, TypeAbonnement type) {
        return listeCLients.stream()
                .filter(c -> c.getAbonnement() != null)
                .filter(c -> c.getAbonnement().getPrix() == type.getPrix())
                .collect(Collectors.toList());
    }

}

