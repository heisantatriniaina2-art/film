package PresentationFilms;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class GestionApplicationTest {

    @Test
    void testGestionFavorisEtHistorique() {
        var client = new Client(10, "Rabesolo", "Marie", "marie@gmail.com", LocalDate.of(2000, 3, 9));
        Film film = new Film(101, GenreFilm.ACTION, "Transporteur", 85, LocalTime.of(2, 28));
        Serie serie = new Serie(202, GenreFilm.ROMANCE, "L'été où je suis devenue jolie", 95, 62, 5, LocalTime.of(0, 45));
        assertTrue(client.getFavoris().isEmpty(), "Les favoris devraient être vides au début");
        client.ajouterAuxFavoris(film);
        client.ajouterAuxFavoris(serie);

        assertEquals(2, client.getFavoris().size());
        assertTrue(client.getFavoris().contains(film));

        client.retirerDesFavoris(film);
        assertEquals(1, client.getFavoris().size());
        assertFalse(client.getFavoris().contains(film));

        assertTrue(client.getHistoriqueVisionnage().isEmpty());
        client.regarder(serie);
        client.getHistoriqueVisionnage().add(serie);

        assertEquals(1, client.getHistoriqueVisionnage().size());
        assertEquals("L'été où je suis devenue jolie", client.getHistoriqueVisionnage().get(0).getTitre());
    }

    @Test
    void testCalculNoteMoyenneContenu() {
        Film film = new Film(102, GenreFilm.DRAME, "Titanic", 95, LocalTime.of(3, 15));

        // 2. Ajout de plusieurs avis
        film.ajouterAvis(new Avis("UserA", 5, "Chef d'œuvre !"));
        film.ajouterAvis(new Avis("UserB", 4, "Très bon film, un peu long."));
        film.ajouterAvis(new Avis("UserC", 3, "Pas mal mais triste."));

        assertEquals(4.0, film.getNoteMoyenne(), 0.01, "La note moyenne devrait être de 4.0");
    }
}