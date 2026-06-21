package PresentationFilms;

import java.time.LocalDate;

public class Utilisateur {
    private int idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String email;
    private LocalDate dateNaissance;

    public Utilisateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
