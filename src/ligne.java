public class Ligne {
    private int id;
    private String nom;
    private String type;
    private String position;

    public Ligne(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.position = "Position inconnue";
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public String getPosition() {
        return position;
    }

    public void mettreAJourPosition(String nouvellePosition) {
        if (nouvellePosition == null || nouvellePosition.isBlank()) {
            this.position = "Position inconnue";
        } else {
            this.position = nouvellePosition;
        }
    }

    public void afficherPosition() {
        System.out.println("Ligne " + nom + " (" + type + ") - Position actuelle : " + position);
    }

    public void afficherTempsArrivee() {
        System.out.println("Temps d'arrivée estimé pour la ligne " + nom + " : 15 minutes");
    }
}