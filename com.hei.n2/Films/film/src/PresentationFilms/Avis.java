package PresentationFilms;

public class Avis {
    private String nomUtilisateur;
    private int note; // Note sur 5
    private String commentaire;

    public Avis(String nomUtilisateur, int note, String commentaire) {
        this.nomUtilisateur = nomUtilisateur;
        this.note = note;
        this.commentaire = commentaire;
    }

    public int getNote() {
        return note;
     }
    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getCommentaire() {
        return commentaire;
    }
}