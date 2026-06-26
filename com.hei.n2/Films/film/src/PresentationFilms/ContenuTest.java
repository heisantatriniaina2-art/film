package PresentationFilms;

import PresentationFilms.Film;
import PresentationFilms.GenreFilm;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ContenuTest {
    @Test
    void testEstDisponible() {
        var filmSorti = new Film(1, GenreFilm.ACTION, "Mad Max", 88, LocalTime.of(1,35 ));
        assertTrue(filmSorti.estDisponible(), "Le film devrait être disponible");

        var futurFilm = new Film(2, GenreFilm.ACTION, "Prochain Hit", 85, LocalTime.of(1,53 ));
        assertFalse(futurFilm.estDisponible(), "Le film ne devrait pas être disponible");
    }
    @Test
    void testAjouterAvis() {
        Film film = new Film(101, GenreFilm.ACTION, "Transporteur", 85, LocalTime.of(1, 28, 45));
        Avis avis = new Avis("UtilisateurTest", 5, "Super film !");
        film.ajouterAvis(avis);

        assertEquals(1, film.getListeAvis().size(), "La liste d'avis devrait contenir 1 élément.");
        assertEquals("UtilisateurTest", film.getListeAvis().get(0).getNomUtilisateur());
    }
}
