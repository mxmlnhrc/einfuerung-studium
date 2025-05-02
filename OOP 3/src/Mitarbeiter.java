public class Mitarbeiter {
    private static int naechsteId = 1;  // für Auto-Inkrement
    private final int id;
    private String name;

    public Mitarbeiter(String name) {
        this.id = naechsteId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
