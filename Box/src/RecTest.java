/**
 * Created by MD on 23/09/2015.
 */
public class RecTest {
    private int list[] ;

    RecTest(int i){
        this.list = new int[i] ;
    }

    void RecPrint(int i){
        if(i < 0)
            return;
        else
            RecPrint(i - 1);
        System.out.println("[" + i + "]  " + this.list[i]);
    }
}
