package PresentationFilms;

import java.time.LocalTime;

public abstract class Contenu {
    private int idContenu;
    private GenreFilm genreFilm;
    private String titre;
    private int popularite;

    public Contenu(int idContenu, GenreFilm genreFilm, String titre, int popularite) {
        this.idContenu = idContenu;
        this.genreFilm = genreFilm;
        this.titre = titre;
        this.popularite = popularite;
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

    public int getPopularite() {
        return popularite;
    }

    public void incrementePopularite() {
        this.popularite++;
    }
}
