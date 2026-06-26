package PresentationFilms;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Serie extends Contenu {
    private int nombreSaison;
    private int nombreEpisode;
    private LocalTime dureeEpisode;

  public Serie (int idContenu, GenreFilm genreFilm, String titre,int popularite, int nombreEpisode, int nombreSaison, LocalTime dureeEpisode){
      super(idContenu, genreFilm, titre, popularite);
      this.nombreEpisode = nombreEpisode;
      this.nombreSaison = nombreSaison;
      this.dureeEpisode = dureeEpisode;
  }
}
