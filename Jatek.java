package csomag;

/**
 *
 * @author Terényi János
 */
public class Jatek {

    private Jatekos j1 = new Jatekos();
    private Jatekos j2 = new Jatekos();
    private Jatekos j3 = new Jatekos();

    public void start() {
        int kitalalando_szam;
        int j1_tipp;
        int j2_tipp;
        int j3_tipp;
        boolean kitalaltak_e = false;

        kitalalando_szam = (int) (Math.random() * 10);
        System.out.println("Gondoltam egy számra, 0 és 9 között...");

        while (!kitalaltak_e) {
            System.out.printf("a kitalálandó szám: %d\n", kitalalando_szam);

            j1.tippel();
            j2.tippel();
            j3.tippel();

            j1_tipp = j1.getTipp();
            j2_tipp = j2.getTipp();
            j3_tipp = j3.getTipp();

            System.out.printf("1. játékos tippje: %d\n", j1_tipp);
            System.out.printf("2. játékos tippje: %d\n", j2_tipp);
            System.out.printf("3. játékos tippje: %d\n", j3_tipp);

            if (kitalalando_szam != j1_tipp && kitalalando_szam != j2_tipp && kitalalando_szam != j3_tipp) {
                System.out.println("a játékosok újra próbálkoznak");
            } else {
                System.out.println("Van nyertes!");
                System.out.printf("1. játékos tippje jó? %b\n", kitalalando_szam == j1_tipp);
                System.out.printf("2. játékos tippje jó? %b\n", kitalalando_szam == j2_tipp);
                System.out.printf("3. játékos tippje jó? %b\n", kitalalando_szam == j3_tipp);
                kitalaltak_e = true;
            }
        }
        System.out.println("Játék vége");
    }
}
