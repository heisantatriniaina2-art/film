package PresentationFilms;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
      void testRegarder(){
        var abonnement = new Abonnement(11889, TypeAbonnement.STANDARD);
        var client = new Client(7, "Ramaro", "Hasina", "hasina@gmail.com", LocalDate.of(2000, 3, 9));
        var film = new Film(23333, GenreFilm.ACTION, "Fast & Furious 7", 79, LocalTime.of(2, 30));

        client.regarder(film);

    }

    @Test
    void testChercherFilms() {
        var client = new Client(7, "Ramaro", "Hasina", "hasina@gmail.com", LocalDate.of(2000, 3, 9));

        var film1 = new Film(23333, GenreFilm.ACTION, "Fast & Furious 7", 79, LocalTime.of(2, 30));
        var film2 = new Film(23334, GenreFilm.DRAME, "Titanic", 95, LocalTime.of(3, 0));
        var film3 = new Film(23335, GenreFilm.ROMANCE, "A contre sens", 110, LocalTime.of(2, 30));
        var film4 = new Film(23336, GenreFilm.ACTION, "Fast & Furious 8", 85, LocalTime.of(3, 0));

        List<Film> tousFilms = List.of(film1, film2, film3, film4);

        List<Film> filmsRecherches = client.chercherFilms(tousFilms, "Fast");

        assertNotNull(filmsRecherches);
        assertEquals(2, filmsRecherches.size());
        assertTrue(filmsRecherches.stream().anyMatch(f -> f.getTitre().equals("Fast & Furious 7")));
        assertTrue(filmsRecherches.stream().anyMatch(f -> f.getTitre().equals("Fast & Furious 8")));
    }

    @Test
    void testChercherFilmsByGenre() {
        var client = new Client(7, "Ramaro", "Hasina", "hasina@gmail.com", LocalDate.of(2000, 3, 9));

        var film1 = new Film(23333, GenreFilm.ACTION, "Fast & Furious 7", 79, LocalTime.of(2, 30));
        var film2 = new Film(23334, GenreFilm.ACTION, "Madagascar Heroes", 95, LocalTime.of(18, 0));
        var film3 = new Film(23335, GenreFilm.ROMANCE, "Love in Antananarivo", 110, LocalTime.of(20, 30));

        List<Film> tousFilms = List.of(film1, film2, film3);

        List<Film> filmsAction = client.chercherFilmsByGenre(tousFilms, GenreFilm.ACTION);

        assertNotNull(filmsAction);
        assertEquals(2, filmsAction.size());
    }

    @Test
    void testVoirHistorique() {
        var client = new Client(7, "Ramaro", "Hasina", "hasina@gmail.com", LocalDate.of(2000, 3, 9));

        var film = new Film(23333, GenreFilm.ACTION, "Fast & Furious 7", 79, LocalTime.of(1, 30));
        var serie = new Serie(4444, GenreFilm.DRAME, "Breaking Bad", 99, 62, 5, LocalTime.of(0, 25));

        assertTrue(client.voirHistorique().isEmpty());

        client.regarder(film);
        client.regarder(serie);

        assertEquals(List.of(film, serie), client.voirHistorique());
    }

}
