package csomag;

/**
 *
 * @author Ter�nyi J�nos
 */

public class Jatekos {

    private int tipp;

    public int getTipp() {
        return this.tipp; 
    }
    
    public void tippel() {
        this.tipp = (int)(Math.random() * 10);
        System.out.printf("tippel�sem: %d\n", this.tipp);
    }
}
