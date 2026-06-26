package PresentationFilms;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenu {
    private List<Integer> episodesParSaison;
    private LocalTime dureeEpisode;

    public Serie(int idContenu, GenreFilm genreFilm, String titre, int popularite, LocalTime dureeEpisode) {
        super(idContenu, genreFilm, titre, popularite);
        this.dureeEpisode = dureeEpisode;
        this.episodesParSaison = new ArrayList<>();
    }

    public void ajouterSaison(int nbEpisodes) {
        this.episodesParSaison.add(nbEpisodes);
    }

    public int getNombreSaison() {
        return this.episodesParSaison.size();
    }

    public void afficherDetailsSaisons() {
        for (int i = 0; i < episodesParSaison.size(); i++) {
            System.out.println("Saison " + (i + 1) + " : " + episodesParSaison.get(i) + " épisodes");
        }
    }
}