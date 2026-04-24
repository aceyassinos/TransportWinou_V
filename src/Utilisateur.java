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

    public boolean seConnecter(String email, String motDePasse) {
        if (email == null || email.isEmpty() || motDePasse == null || motDePasse.isEmpty()) {
            System.out.println("Erreur : L'email et le mot de passe ne peuvent pas être vides.");
            return false;
        }
        if (this.email.equals(email) && this.motDePasse.equals(motDePasse)) {
            System.out.println("Connexion réussie !");
            return true;
        }
        System.out.println("Échec de connexion : email ou mot de passe incorrect.");
        return false;
    }
    @Override
    public String toString() {
        return "Utilisateur : " + nom + " (" + email + ")";
    }
}
