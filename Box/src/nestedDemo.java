/**
 * Created by MD on 24/09/2015.
 */
public class nestedDemo {
    public static void main(String[] args) {
        nestedClass nested = new  nestedClass() ;
        nested.test();

        String str1 = "First String" ;
        String str2 = "Second String" ;
        String str3 = str1 ;

        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(str2.charAt(2));

        for(int i = 0 ; i < args.length ; ++i)
            System.out.println("args[" + i + "] : " + args[i]);
    }
}
