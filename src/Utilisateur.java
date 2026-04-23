public class Utilisateur {
    
    private int id;
    private String nom;
    private String email;
    private String motDePasse;

    public Utilisateur(int id, String nom, String email, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void sInscrire() {
        System.out.println("Inscription réussie !");
    }

    public void seConnecter() {
        System.out.println("Connexion réussie !");
    }
    @Override
    public String toString() {
        return "Utilisateur : " + nom + " (" + email + ")";
    }
}
