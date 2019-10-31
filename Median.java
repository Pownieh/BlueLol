/**
 * Class to be debugged and tested
 *   
 * @author Kurt Jensen
 * @version Oct 2017-10-17
 */
public class Median {

    
    public static void tester() {
        System.out.println(medianWrong(2, 1, 3));
    }
    
    /** 
     * Returns the median of the three parameters. (i.e. the numerical middle).
     * The method contains a bug, and hence it sometimes returns a wrong result.
     */
    public static int medianWrong(int x, int y, int z) {
        int m = z;
        if(y < z) {
            if (x < y) { m = y; }
            else {
                if (x < z) { m = y; }
            }
        }
        else {
            if(x > y) { m = y; }
            else {
                if (x > z) { m = x; }
            }
        }
        return m;
    }

    public static int medianCorrect(int x, int y, int z) {

        if(y < z) {
            if (x < y) { return y; }
            else if (x < z) { return x; }
        }

        if(x > y) { return y; }
        else if (x > z) { return x; }

        return z;
    }
}
