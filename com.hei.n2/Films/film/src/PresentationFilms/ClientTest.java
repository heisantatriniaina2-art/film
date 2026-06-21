package PresentationFilms;
import java.time.LocalDate;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
public class ClientTest {

    @Test
    void testRegarder(){
        var abonnement = new Abonnement(11889, TypeAbonnement.STANDARD);
        var client = new Client(7, "Ramaro", "Hasina", "hasina@gmail.com", LocalDate.of(2000, 3, 9));
        var film = new Film(23333, GenreFilm.ACTION, "Fast & Furious 7", 79, LocalTime.of(2, 30));

        client.regarder(film);

    }
}
