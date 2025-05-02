// AppAuto.java
public class AppAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("AB-1234", 0.0, 60.0, 7.5, 10.0);
        Auto auto2 = new Auto();  // mit Standardwerten

        System.out.println("=== Auto 1 ===");
        auto1.tanken(50.0);
        auto1.fahren(400.0);

        System.out.println("\n=== Auto 2 ===");
        auto2.tanken(40.0);
        auto2.fahren(200.0);

        System.out.println("\n=== Zusammenfassung ===");
        System.out.println(auto1);
        System.out.println(auto2);
    }
}
