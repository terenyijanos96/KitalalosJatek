package csomag;

/**
 *
 * @author Terényi János
 */

public class Jatekos {

    private int tipp;

    public int getTipp() {
        return this.tipp; 
    }
    
    public void tippel() {
        this.tipp = (int)(Math.random() * 10);
        System.out.printf("tippelésem: %d\n", this.tipp);
    }
}
