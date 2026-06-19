package PresentationFilms;

import java.time.LocalDate;

public class Client extends Utilisateur{

    public Client(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance){
        super(idUtilisateur,nomUtilisateur, prenomUtilisateur, email, dateNaissance);
    }


}
