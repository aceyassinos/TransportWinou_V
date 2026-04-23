public class Ligne {
    private int id;
    private String nom;
    private String type;
    
    // Constructor
    public Ligne(int id, String nom, String type) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getType() {
        return type;
    }
    
    // Methods
    public void afficherPosition() {
        System.out.println("Ligne " + nom + " (ID: " + id + ") - Type: " + type);
    }
    
    public void afficherTempsArrivee() {
        System.out.println("Temps d'arrivée estimé pour la ligne " + nom + ": 15 minutes");
    }
}
