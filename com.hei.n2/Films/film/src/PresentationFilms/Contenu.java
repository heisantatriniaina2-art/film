package PresentationFilms;

import java.time.LocalTime;

public class Contenu {
    private int idContenu;
    private GenreFilm genreFilm;
    private String titre;
    private long popularite;

    public Contenu(int idContenu, GenreFilm genreFilm, String titre, int popularite) {
        this.idContenu = idContenu;
        this.genreFilm = genreFilm;
        this.titre = titre;
        this.popularite = popularite;
    }


    public boolean estDisponible() {
        return this.popularite >= 0;
    }

    public int getIdContenu() {
        return idContenu;
    }

    public GenreFilm getGenreFilm() {
        return genreFilm;
    }

    public String getTitre() {
        return titre;
    }

    public long getPopularite() {
        return popularite;
    }

    public void incrementePopularite() {
        this.popularite++;
    }

    @Override
    public String toString() {
        return "Titre: " + this.titre + " | Genre: " + this.genreFilm + " | Popularité: " + this.popularite;
    }
    private java.util.List<Avis> listeAvis = new java.util.ArrayList<>();

    public void ajouterAvis(Avis avis) {
        this.listeAvis.add(avis);
    }

    public double getNoteMoyenne() {
        if (listeAvis.isEmpty()) {
            return 0.0;
        }
        double somme = 0;
        for (Avis avis : listeAvis) {
            somme += avis.getNote();
        }
        return somme / listeAvis.size();
    }

    public java.util.List<Avis> getListeAvis() {
        return listeAvis;
    }

    public void setPopularite(long popularite) {
        this.popularite = popularite;
    }
}

