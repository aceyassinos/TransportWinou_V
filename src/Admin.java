import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String nom;
    private List<Ligne> lignes;

    public Admin(String nom) {
        this.nom = nom;
        this.lignes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void gererLignes(Ligne ligne) {
        lignes.add(ligne);
        System.out.println("L'administrateur " + nom + " gère la ligne de transport: " + ligne.getNom());
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public void consulterStatistiques() {
        System.out.println("Consultation des statistiques du système...");
    }

    public void consulterStatistiques(int utilisateurs, int alertes) {
        System.out.println("=== Statistiques du système ===");
        System.out.println("Utilisateurs: " + utilisateurs);
        System.out.println("Alertes: " + alertes);
        System.out.println("Lignes gérées: " + lignes.size());
    }

    public void listerLignes() {
        System.out.println("Lignes de transport gérées par " + nom + ":");
        for (Ligne ligne : lignes) {
            System.out.println("  - " + ligne.getNom());
        }
    }

    public void validerAlerte(Alerte alerte) {
        System.out.println("Admin " + nom + " valide l'alerte : " + alerte.getMessage());
    }

    public void publierAnnonce(String annonce) {
        System.out.println("Admin " + nom + " publie une annonce : " + annonce);
    }
}
