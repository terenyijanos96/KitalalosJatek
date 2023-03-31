package csomag;

/**
 *
 * @author Ter�nyi J�nos
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
        System.out.println("Gondoltam egy sz�mra, 0 �s 9 k�z�tt...");

        while (!kitalaltak_e) {
            System.out.printf("a kital�land� sz�m: %d\n", kitalalando_szam);

            j1.tippel();
            j2.tippel();
            j3.tippel();

            j1_tipp = j1.getTipp();
            j2_tipp = j2.getTipp();
            j3_tipp = j3.getTipp();

            System.out.printf("1. j�t�kos tippje: %d\n", j1_tipp);
            System.out.printf("2. j�t�kos tippje: %d\n", j2_tipp);
            System.out.printf("3. j�t�kos tippje: %d\n", j3_tipp);

            if (kitalalando_szam != j1_tipp && kitalalando_szam != j2_tipp && kitalalando_szam != j3_tipp) {
                System.out.println("a j�t�kosok �jra pr�b�lkoznak");
            } else {
                System.out.println("Van nyertes!");
                System.out.printf("1. j�t�kos tippje j�? %b\n", kitalalando_szam == j1_tipp);
                System.out.printf("2. j�t�kos tippje j�? %b\n", kitalalando_szam == j2_tipp);
                System.out.printf("3. j�t�kos tippje j�? %b\n", kitalalando_szam == j3_tipp);
                kitalaltak_e = true;
            }
        }
        System.out.println("J�t�k v�ge");
    }
}
