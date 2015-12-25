package org.bhi.q1;

/**
 *
 * @author carlo nino mabalatan
 */
public class SpinningWheel {

    public static void main(String[] args) {

        int wheelnumber = 0;
        int usernumber = 0;
        int MAX_SPIN = 200;

        for (int i = 0; i < MAX_SPIN; i++) {
            usernumber = (int) (Math.random() * 50) + 1;

            wheelnumber++;
            if (usernumber % 10 != 0) {
                break;
            }
        }
        System.out.println("The wheel was spun 200 times.");
        System.out.println("Number of times charity number appears : " + usernumber);
        System.out.println("Number of times a winner has won : " + wheelnumber);
    }

}
