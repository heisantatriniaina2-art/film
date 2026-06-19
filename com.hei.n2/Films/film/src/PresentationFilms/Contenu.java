package PresentationFilms;

import java.time.LocalTime;

public abstract class Contenu {
    private int idContenu;
    private GenreFilm genreFilm;
    private String nomFilm;

    public Contenu(int idContenu, GenreFilm genreFilm, String nomFilm) {
        this.idContenu = idContenu;
        this.genreFilm = genreFilm;
        this.nomFilm = nomFilm;
    }
}
