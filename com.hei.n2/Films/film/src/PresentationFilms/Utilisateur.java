package PresentationFilms;

import java.time.LocalDate;

public abstract class Utilisateur {
    private int idUtilisateur;
    private String nomUtilisateur;
    private String prenomUtilisateur;
    private String email;
    private LocalDate dateNaissance;
    private String motDePasse;
    private boolean estConnecte;

    public Utilisateur(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenomUtilisateur = prenomUtilisateur;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.motDePasse = motDePasse;
        this.estConnecte = false;
    }

    public boolean estMajeur() {
        return this.dateNaissance.plusYears(18).isBefore(LocalDate.now());
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public boolean seConnecter(String email, String motDePasse) {
        if (this.email.equals(email) && this.motDePasse.equals(motDePasse)) {
            this.estConnecte = true;
            System.out.println(this.email +"est connecté");
            return true;
        }
        System.out.println("Erreur : Email ou mot de passe incorrect.");
        return false;
    }

    public void seDeconnecter() {
        this.estConnecte = false;
        System.out.println("Vous êtes déconnecté");
    }

    public boolean changerMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        if (this.motDePasse.equals(ancienMotDePasse)) {
            this.motDePasse = nouveauMotDePasse;
            System.out.println("Mot de passe mis à jour avec succès.");
            return true;
        }
        System.out.println("Erreur : L'ancien mot de passe est incorrect.");
        return false;
    }

    public boolean aUnEmailValide() {
        return this.email != null && this.email.contains("@") && this.email.contains(".");
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


    @Override
    public String toString() {
        return "Utilisateur : " + prenomUtilisateur + " " + nomUtilisateur + " (" + email + ")";
    }
}
