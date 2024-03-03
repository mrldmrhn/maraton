import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] kosucular = {"Kadir", "Gökhan", "Hakan", "Suzan",
                "Pınar", "Mehmet", "Ali", "Emel", "Firat", "James",
                "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] dereceler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334,
                412, 393, 299, 343, 317, 265};

        Maraton maraton = new Maraton(dereceler,kosucular);
        maraton.siralaKosucu();
        maraton.birinciKosucu();
        maraton.ikinciKosucu();
        maraton.ucuncuKosucu();
        maraton.sinifKosucular();

    }
}
