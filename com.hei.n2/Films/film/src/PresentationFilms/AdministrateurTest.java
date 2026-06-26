package PresentationFilms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

public class AdministrateurTest {
    @Test
    void testConsulterTopPopulaire(){
        var admin = new Administrateur(4, "Rasolo","Aina", "aina@gmail.com", LocalDate.of(2000, 3, 8));

        List<Contenu> listeContenus = new ArrayList<>();

        listeContenus.add(new Film(234, GenreFilm.ROMANCE, "My life with the walter boy",89, LocalTime.of(1, 30, 29)));
        listeContenus.add(new Film(254, GenreFilm.COMEDIE, "Mr Bean's Holiday", 100, LocalTime.of(11, 30)));

        admin.consulterTopPopulaires(listeContenus);
    }

    @Test
    void testConsulterRevenus(){
        var admin = new Administrateur(1, "Rakoto", "Paul", "rakoto@gmail.com", LocalDate.of(1996, 2, 6));

        var abonnement1 = new Abonnement(2899,10.0, TypeAbonnement.PREMIUM);
        var abonnement2 = new Abonnement(2898,20.0, TypeAbonnement.VIP);

        var client1 = new Client(2, "Randria", "Miary", "miary@gmail.com", LocalDate.of(1999, 4, 6));
        var client2 = new Client(3, "Rahary", "Tiana", "rahary@gmail.com", LocalDate.of(2001, 5, 8));

        client1.setAbonnement(abonnement1);
        client2.setAbonnement(abonnement2);

        List<Client> listeClient = new ArrayList<>();
        listeClient.add(client1);
        listeClient.add(client2);

        double revenus = admin.consulterRevenus(listeClient);

        // Si vos abonnements PREMIUM et VIP totalisent 30.0, le test passera
        assertEquals(30.0, revenus, 0.001);
    }
}
