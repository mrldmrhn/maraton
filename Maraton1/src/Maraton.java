public class Maraton {
    private int[] dereceler;
    private String[] kosucular;

    public Maraton(int[] dereceler, String[] kosucular) {
        this.dereceler = dereceler;
        this.kosucular = kosucular;
    }

    public int[] getDereceler() {
        return dereceler;
    }

    public void setDereceler(int[] dereceler) {
        this.dereceler = dereceler;
    }

    public String[] getKosucular() {
        return kosucular;
    }

    public void setKosucular(String[] kosucular) {
        this.kosucular = kosucular;
    }

    public void siralaKosucu() {
        for (int i = 0; i < dereceler.length - 1; i++) {
            for (int j = 0; j < dereceler.length - i - 1; j++) {
                if (dereceler[j] > dereceler[j + 1]) {
                    degisDereceler(j);
                    degisKosucular(j);
                }
            }
        }
    }

    private void degisKosucular(int j) {
        String tempKosucular;
        tempKosucular = kosucular[j];
        kosucular[j] = kosucular[j + 1];
        kosucular[j + 1] = tempKosucular;
    }

    private void degisDereceler(int index) {
        int tempDereceler;
        tempDereceler = dereceler[index];
        dereceler[index] = dereceler[index+ 1];
        dereceler[index + 1] = tempDereceler;
    }

    public void birinciKosucu() {
        System.out.println("Birinci: " + kosucular[0] + " " + dereceler[0]+"'");
    }

    public void ikinciKosucu() {
        System.out.println("" +
                "Ikinci: " + kosucular[1] + " " + dereceler[1]+"'");
    }

    public void ucuncuKosucu() {
        System.out.println("Ucuncu: " + kosucular[2] + " " + dereceler[2]+"'");
    }

    public void sinifKosucular() {
        int A = 0;
        int B = 0;
        int C = 0;

        for (int i = 0; i < dereceler.length; i++) {

            if (dereceler[i] < 300) {
                ++A;
            } else if (dereceler[i] < 400) {
                ++B;
            } else {
                ++C;
            }
        }
        System.out.println("A -> " + A);
        System.out.println("B -> " + B);
        System.out.println("C -> " + C);
    }
}
