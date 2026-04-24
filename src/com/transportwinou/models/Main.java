package com.transportwinou.models;
public class Main {
    public static void main(String[] args) {

        System.out.println("=== TransportWinou — Sprint 2 ===");

        System.out.println("\n--- Authentification ---");
        Utilisateur utilisateur = new Utilisateur(1, "Alice", "alice@example.com", "motdepasse123");
        utilisateur.sInscrire();
        utilisateur.seConnecter();

        System.out.println("\n--- Recherche d'itinéraire ---");
        Trajet trajet = new Trajet(101, "Station A", "Station B", 25);
        trajet.rechercherTrajet();

        System.out.println("\n--- Suivi temps réel ---");
        Ligne ligne = new Ligne(7, "Ligne 7", "Bus");
        ligne.afficherPosition();
        ligne.afficherTempsArrivee();

        System.out.println("\n--- GPS ---");
        GPS gps = new GPS();
        gps.envoyerPosition(ligne, "Station République");
        gps.envoyerIncident("Panne signalée sur la ligne 7");

        System.out.println("\n--- Alertes ---");
        Alerte alerte = new Alerte(1, "urgent", "Défaut de signalisation détecté");
        alerte.envoyerAlerte();
        alerte.afficherDetails();

        System.out.println("\n--- Administration ---");
        Admin admin = new Admin("Dhia");
        admin.gererLignes(ligne);
        admin.consulterStatistiques();

        System.out.println("\n=== Fin de la démonstration ===");
    }
}