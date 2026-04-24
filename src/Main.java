public class Main {
    public static void main(String[] args) {
        System.out.println("=== Authentification utilisateur ===");
        Utilisateur utilisateur = new Utilisateur(1, "Alice", "alice@example.com", "motdepasse123");
        utilisateur.sInscrire();
        utilisateur.seConnecter();
        System.out.println(utilisateur);
        System.out.println();

        System.out.println("=== Recherche d'itinéraire ===");
        Trajet trajet = new Trajet(101, "Station A", "Station B", 25);
        trajet.rechercherTrajet();
        System.out.println();

        System.out.println("=== Suivi en temps réel de la ligne ===");
        Ligne ligne = new Ligne(7, "Ligne 7", "Bus");
        ligne.afficherPosition();
        ligne.afficherTempsArrivee();
        System.out.println();

        System.out.println("=== Système GPS ===");
        GPS gps = new GPS();
        gps.envoyerPosition(ligne);
        gps.envoyerIncident("Panne signalée sur la ligne 7");
        System.out.println();

        System.out.println("=== Gestion des alertes ===");
        Alerte alerte = new Alerte("Défaut de signalisation détecté");
        alerte.envoyer();
        System.out.println();

        System.out.println("=== Administration ===");
        Admin admin = new Admin("Bob");
        admin.validerAlerte(alerte);
        admin.publierAnnonce("Service normal repris sur la ligne 7.");
    }
}

