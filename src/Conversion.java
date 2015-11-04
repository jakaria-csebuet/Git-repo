/**
 * Created by MD on 22/09/2015.
 */
public class Conversion {
    public static void main(String args[]) {
        int list[][] = new int[10][] ;
        for(int i = 0 ; i < 10 ; ++i)
            list[i] = new int[i+1] ;
        int k = 0 ;
        for(int i = 0 ; i < 10 ; ++i) {
            for (int j = 0; j <= i; ++j) {
                list[i][j] = k;
                k++;
            }
        }
        for(int i = 0 ; i < 10 ; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print( list[i][j] + "  " );
            }
            System.out.println("");
        }
    }
}
