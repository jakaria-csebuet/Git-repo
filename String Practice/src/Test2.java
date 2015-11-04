/**
 * Created by MD on 10/10/2015.
 */
public class Test2 {
    public static void main(String[] args) {
        String nabila = "NabilaNova" ;
        String nova = nabila.substring(6,10) ;
        System.out.println(nova);

        /**System.out.println(nabila == nova);
        System.out.println(nabila.equals(nova));

        /**System.out.println(nabila.regionMatches(true,1,nova,1,3));
        System.out.println("Nabila".startsWith("bi",2));
        System.out.println("Nova".endsWith("va"));

        /**Box b = new Box(12.0,10,98) ;
        System.out.println(b);
        String str = "Bax b: " + b ;
        System.out.println(str);
        byte ch[] ;
        ch = str.getBytes();
        System.out.println(ch);

        /**byte[] ch = {'N','a','b','i','l','a',' ','N','o','v','a'} ;
        byte[] ch1 = {97,98,99,66,67,68} ;
        String moyna = new String(ch) ;
        String pakhi = new String(ch,7,4) ;
        String moyna1 = "Nabila" ;
        System.out.println(moyna1);

        //System.out.println(pakhi);

        System.out.println(moyna1.length());
        System.out.println("Nabila Nova".length());

        String nafisaAmmu = "Nabila" ;
        String nafiasAbbu = "Jakaria" ;
        String tuntuni = 1 + " Nabia\n" + 2 + " "+ nafiasAbbu
                + "\n" + 3 + "  Nova" ;

        System.out.println(tuntuni);

        //String moyna_pakhi = new String(moyna) ;
        //System.out.println(moyna_pakhi);
        //String str = new String(ch1) ;
        //String str1 = new String(ch1,2,3) ;
        //System.out.println(str);
        //System.out.println(str1); */
    }
}

class Box{
    Double length ;
    Double width ;
    Double height ;
    Box(Double length,double width,double height){
        this.length = length ;
        this.width = width ;
        this.height = height ;
    }
    public String toString(){
        return "Dimensions are " + length + " by " + width + " by " + height + ".";
    }
}
