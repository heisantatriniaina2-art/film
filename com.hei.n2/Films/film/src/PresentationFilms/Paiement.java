package PresentationFilms;

public class Paiement {
    private int idPaiement;
    private double montant;
    private ModePaiement modePaiement;
    private StatutPaiement statutPaiement;

    public Paiement(String statutPaiement, ModePaiement modePaiement, double montant, int idPaiement) {
        this.statutPaiement = StatutPaiement.EN_ATTENTE;
        this.modePaiement = modePaiement;
        this.montant = montant;
        this.idPaiement = idPaiement;
    }

    public boolean traiterPaiement() {
        if (this.montant > 0) {
            this.statutPaiement = StatutPaiement.VALIDE;
            return true;
        } else {
            this.statutPaiement = StatutPaiement.REFUSE;
            return false;
        }
    }

    public int getIdPaiement() {
        return idPaiement;
    }

    public double getMontant() {
        return montant;
    }

    public ModePaiement getModePaiement() {
        return modePaiement;
    }

    public StatutPaiement getStatutPaiement() {
        return statutPaiement;
    }

    public void setIdPaiement(int idPaiement) {
        this.idPaiement = idPaiement;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setModePaiement(ModePaiement modePaiement) {
        this.modePaiement = modePaiement;
    }

    public void setStatutPaiement(StatutPaiement statutPaiement) {
        this.statutPaiement = statutPaiement;
    }
}
