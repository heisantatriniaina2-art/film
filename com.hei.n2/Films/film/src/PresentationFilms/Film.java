package PresentationFilms;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Film extends Contenu{
    private LocalTime duree;

    public Film(int idContenu, GenreFilm genreFilm, String titre, int popularite, LocalTime duree){
        super(idContenu, genreFilm, titre, popularite);
        this.duree = duree;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        String dureeFormatee = duree.format(DateTimeFormatter.ofPattern("HH:mm"));
        return super.toString() + " | Durée: " + dureeFormatee + "h";
    }
}
