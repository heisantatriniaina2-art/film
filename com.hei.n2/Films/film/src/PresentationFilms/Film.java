package PresentationFilms;

import java.time.LocalTime;

public class Film extends Contenu{
    private LocalTime duree;

    public Film(int idContenu, GenreFilm genreFilm, String nomFilm, LocalTime duree){
        super(idContenu, genreFilm, nomFilm);
        this.duree = duree;
    }



}
