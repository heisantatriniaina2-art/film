
package PresentationFilms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client extends Utilisateur {
    public Abonnement abonnement;
    private List<Contenu> historique = new ArrayList<>();


    public Client(int idUtilisateur, String nomUtilisateur, String prenomUtilisateur,
                  String email, LocalDate dateNaissance) {
        super(idUtilisateur, nomUtilisateur, prenomUtilisateur, email, dateNaissance);
    }
    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public List<Contenu> voirHistorique() {
        return historique;
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
    private java.util.List<Contenu> favoris = new java.util.ArrayList<>();
    private java.util.List<Contenu> historiqueVisionnage = new java.util.ArrayList<>();

    public void ajouterAuxFavoris(Contenu contenu) {
        if (!favoris.contains(contenu)) {
            favoris.add(contenu);
        }
    }

    public void retirerDesFavoris(Contenu contenu) {
        favoris.remove(contenu);
    }

    public void regarder(Contenu contenu) {
        historiqueVisionnage.add(contenu);
        contenu.setPopularite(contenu.getPopularite() + 1);
        System.out.println(getNomUtilisateur() + " regarde actuellement : " + contenu.getTitre());
    }

    public java.util.List<Contenu> getFavoris() { return favoris; }
    public java.util.List<Contenu> getHistoriqueVisionnage() { return historiqueVisionnage; }
}