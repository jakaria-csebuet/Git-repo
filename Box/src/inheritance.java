/**
 * Created by MD on 24/09/2015.
 *
 */
public class inheritance {
    public static void main(String[] args) {
        Parent parent = new Parent() ;
        parent.i = 10 ;
        parent.j = 12 ;

        parent.parentShow();

        Son son = new Son() ;
        son.k = 1998 ;
        son.i = 12 ;
        son.j = 10 ;

        son.showSon();
        son.sum();
        son.parentShow();
    }
}
