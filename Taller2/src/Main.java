public class Main {
    public static void main(String[] args) throws Exception {
        
        ShuttleVehicles lanzadera = new ShuttleVehicles("navePrueba", 200, 500, "Hidrogeno");
        lanzadera.menu();
        System.out.println(lanzadera.functioning());
        System.out.println(lanzadera.finalReport());

    }
}
