package PresentationFilms;

import java.time.LocalDate;

public class Administrateur extends Utilisateur{
    public Administrateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance){
        super(idUtilisateur,nomUtilisateur, prenomUtilisateur, email, dateNaissance);
    }
}

