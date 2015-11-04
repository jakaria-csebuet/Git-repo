/**
 * Created by MD on 24/09/2015.
 */
public class nestedClass {
    static int a = 100 ;

    void test(){
        innerClass inner = new innerClass() ;
        inner.display();
    }

    public class innerClass{
        void display(){
            System.out.println("Inner: " + a);
        }
    }
}
