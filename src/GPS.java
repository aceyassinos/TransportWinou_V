public class GPS {
    
    public void envoyerPosition(Ligne ligne) {
        System.out.println("=== Envoi de Position ===");
        System.out.println("Ligne: " + ligne.getNom());
        System.out.println("ID: " + ligne.getId());
        System.out.println("Type: " + ligne.getType());
        System.out.println("✓ Position envoyée avec succès");
        System.out.println();
    }
    
    public void envoyerIncident(String message) {
        System.out.println("=== Signalement d'Incident ===");
        System.out.println("Message: " + message);
        System.out.println("⚠ Incident enregistré et signalé aux responsables");
        System.out.println();
    }
}
