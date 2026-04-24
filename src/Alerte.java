public class Alerte {
    private String message;

    public Alerte(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void envoyer() {
        System.out.println("Alerte envoyée : " + message);
    }
}

    public Alerte(int id, String type, String message) {
        this.id = id;
        this.type = type;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public void envoyerAlerte() {
        System.out.println("Alerte envoyée : " + type + " - " + message);
    }

    public void afficherDetails() {
        System.out.println("===== ALERTE =====");
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Message: " + message);

        if (type.equalsIgnoreCase("critique")) {
            System.out.println("⚠ ALERTE CRITIQUE !");
        } else if (type.equalsIgnoreCase("urgent")) {
            System.out.println("⚠ Alerte urgente");
        } else {
            System.out.println("Alerte normale");
        }

        System.out.println("==================");
    }
}
