
package PresentationFilms;

import java.time.LocalDate;
import java.util.List;

public class Client extends Utilisateur {
    public Abonnement abonnement;

    public Client(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String email, LocalDate dateNaissance){
        super(idUtilisateur,nomUtilisateur, prenomUtilisateur, email, dateNaissance);
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public void regarder(Contenu media) {
        System.out.println(getNomUtilisateur() + " regarde le média : " + media.getTitre());
        media.incrementePopularite();
    }

    public List<Film> chercherFilms(List<Film> tousFilms, String titreRecherche) {
        List<Film> resultats = tousFilms.stream()
                .filter(film -> film.getTitre().toLowerCase().contains(titreRecherche.toLowerCase()))
                .toList();

        System.out.println("Résultats de la recherche par titre :");

        resultats.forEach(film -> System.out.println("Titre : " + film.getTitre() + ", Genre : " + film.getGenreFilm()));

        return resultats;
    }

    public List<Film> chercherFilmsByGenre(List<Film> tousFilms, GenreFilm genre) {
        List<Film> resultats = tousFilms.stream()
                .filter(film -> film.getGenreFilm() == genre)
                .toList();

        System.out.println("Résultats de la recherche par genre :");

        resultats.forEach(film -> System.out.println("Titre : " + film.getTitre() + ", Genre : " + film.getGenreFilm()));

        return resultats;
    }


}