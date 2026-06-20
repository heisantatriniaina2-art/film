package PresentationFilms;

import java.time.LocalTime;

public class Film extends Contenu{
    private LocalTime duree;

    public Film(int idContenu, GenreFilm genreFilm, String titre, int popularite, LocalTime duree){
        super(idContenu, genreFilm, titre, popularite);
        this.duree = duree;
    }

}
