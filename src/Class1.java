import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by MD on 19/09/2015.
 */
public class Class1 {

    /**
     *  () parentheses
     *  {} braces
     *  [] bracket
     * @ param args
     * long 64 bit]
     * int 32 bit
     * short 16 bit
     * byte is 8 bit integer
     * Java uses unicode to represent character
     * Unicode require 16 bit or 2 byte
     * JDK Java Development Kit
     * E is decimal exponent
     * P is binary exponent
     * Hi hi hi... Java has no pointer
     * Java has no goto statement
     */
    /**public static void main(String[] args) {
        System.out.println("This is simpliest java code!!");
        System.out.println("Null value " + null);
        byte b,c ;
        b = 10 ;
        c = 12 ;

        System.out.println(b + " " + c) ;
    }*/

    public static void main(String args[]) {
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("Before the break.");
                    if(t) break second; // break out of second block
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("This is after second block.");
        }
    }

    /**public static void main(String args[]) {

        /**first: {
            System.out.println("this will not execute");
        }

        second: {
            System.out.println("This also wont execute");
        }

        third: {
            System.out.println("This will execute!!");
        }

        break third ;


        /**int nums[] = {0,1,2,3,4,5,6,7,8,9,10} ;
        int sum = 0 ;

            for(int x : nums){
            System.out.println(x);
            sum += x ;
        }

        System.out.println(sum);

       /** char ch1 , ch2 ;
        ch1 = 88 ;
        ch2 = (char)(ch1 + 1) ;

        System.out.println(ch1 +" "+ ch2);
        Character a, b ;
        a = 'A' ;
        System.out.println(a + " " + ++a);

        boolean p , q ;
        p = true ;
        q = false ;

        System.out.println(p +" " + q);

        int x = 0b1100_1010_1101_0110;
        System.out.println(x);

        double i = 3.0 , j = 4.0 ;
        double k = Math.sqrt(i*i + j*j) ;
        System.out.println(k);

        int l = 0 ;
        for(l=0 ; l <= 3 ; ++l){
            int y = 10 ;
            System.out.println(y);
            y += 10 ;
        }

        /**float d[][] = {
                { 0*0, 1*0, 2*0, 3*0 },
                { 0*1, 1*1, 2*1, 3*1 },
                { 0*2, 1*2, 2*2, 3*2 },
                { 0*3, 1*3, 2*3, 3*3 }
        };
        for(int m = 0 ; m < 4 ; ++m){
            for(int n = 0 ; n < 4 ; ++n){
                System.out.print(d[m][n] + " ");
            }
            System.out.println("");
        }*/

}