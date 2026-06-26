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
    void test
}
