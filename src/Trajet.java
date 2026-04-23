import java.util.ArrayList;
import java.util.List;

public class Trajet {
    private int id;
    private String depart;
    private String destination;
    private int tempsEstime;
    private List<Route> routesAlternatives;

    public Trajet(int id, String depart, String destination, int tempsEstime) {
        this.id = id;
        this.depart = depart;
        this.destination = destination;
        this.tempsEstime = tempsEstime;
        this.routesAlternatives = new ArrayList<>();
        // Ajouter la route principale comme première option
        this.routesAlternatives.add(new Route("Route principale", tempsEstime));
    }

    public int getId() {
        return id;
    }

    public String getDepart() {
        return depart;
    }

    public String getDestination() {
        return destination;
    }

    public int getTempsEstime() {
        return tempsEstime;
    }

    public void ajouterRouteAlternative(String nom, int temps) {
        routesAlternatives.add(new Route(nom, temps));
    }

    public void rechercherTrajet() {
        System.out.println("=== Recherche de trajet ===");
        System.out.println("De: " + depart + " vers: " + destination);
        System.out.println("\nOptions disponibles:");
        
        // Trouver la route la plus rapide
        Route meilleureRoute = routesAlternatives.get(0);
        for (Route route : routesAlternatives) {
            if (route.getTemps() < meilleureRoute.getTemps()) {
                meilleureRoute = route;
            }
        }
        
        // Afficher toutes les routes avec mise en évidence de la plus rapide
        for (int i = 0; i < routesAlternatives.size(); i++) {
            Route route = routesAlternatives.get(i);
            String marker = route.equals(meilleureRoute) ? "⭐ " : "   ";
            System.out.println(marker + (i + 1) + ". " + route.getNom() + " - " + route.getTemps() + " minutes");
        }
        
        System.out.println("\n✓ Route recommandée: " + meilleureRoute.getNom() + " (" + meilleureRoute.getTemps() + " minutes)");
    }

    public void afficherMeilleureRoute() {
        Route meilleureRoute = routesAlternatives.get(0);
        for (Route route : routesAlternatives) {
            if (route.getTemps() < meilleureRoute.getTemps()) {
                meilleureRoute = route;
            }
        }
        System.out.println("\nMeilleure route: " + meilleureRoute.getNom() + " (" + meilleureRoute.getTemps() + " minutes)");
    }

    // Classe interne pour représenter une route alternative
    private static class Route {
        private String nom;
        private int temps;

        public Route(String nom, int temps) {
            this.nom = nom;
            this.temps = temps;
        }

        public String getNom() {
            return nom;
        }

        public int getTemps() {
            return temps;
        }
    }
}
