package entity;

public class Kategori {

    private String id;
    private String name;

    public Kategori(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // getter
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}
