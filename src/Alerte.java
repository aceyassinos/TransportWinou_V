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

