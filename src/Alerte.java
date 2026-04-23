public class Alerte {
    private int id;
    private String type;
    private String message;

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
        System.out.println("Alerte : " + type + " - " + message);
    }

    public void afficherDetails() {
        System.out.println("ID : " + id);
        System.out.println("Type : " + type);
        System.out.println("Message : " + message);
    }
}
