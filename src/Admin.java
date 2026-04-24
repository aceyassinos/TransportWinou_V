public class Admin {
    private String nom;

    public Admin(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void validerAlerte(Alerte alerte) {
        System.out.println("Admin " + nom + " valide l'alerte : " + alerte.getMessage());
    }

    public void publierAnnonce(String annonce) {
        System.out.println("Admin " + nom + " publie une annonce : " + annonce);
    }
}
