/**
 * Created by MD on 07/10/2015.
 * Strings are in string class
 */
public class Test1 {
    public static void main(String[] args) {
        String s = 123 + " "  + 234 ;
        System.out.println(s);
        String a = new String() ;
        a = "Nova" ;
        char chr[] = {'J','a','k','a','r','i','a','N','a','b','i','l','a',} ;
        String b = new String(chr,0,7) ;
        String c = new String(b) ;
        System.out.println(c + " " + a);
    }
}
