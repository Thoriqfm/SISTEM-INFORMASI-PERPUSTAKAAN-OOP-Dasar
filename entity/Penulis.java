package entity;

public class Penulis {

    private String id;
    private String name;

    public Penulis(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter method
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}
