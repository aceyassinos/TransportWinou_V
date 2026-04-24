package com.transportwinou.models;
public class GPS {

    public void envoyerPosition(Ligne ligne, String position) {
        if (ligne == null) {
            System.out.println("Erreur : aucune ligne fournie.");
            return;
        }

        ligne.mettreAJourPosition(position);

        System.out.println("=== Envoi de Position ===");
        System.out.println("Ligne: " + ligne.getNom());
        System.out.println("Nouvelle position: " + ligne.getPosition());
        System.out.println("✓ Position mise à jour avec succès");
        System.out.println();
    }

    public void envoyerIncident(String message) {
        System.out.println("=== Signalement d'Incident ===");
        System.out.println("Message: " + message);
        System.out.println("⚠ Incident enregistré et signalé aux responsables");
        System.out.println();
    }
}