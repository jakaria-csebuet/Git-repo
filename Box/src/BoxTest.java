/**
 * Created by MD on 23/09/2015.
 */
public class BoxTest {
    public static void main(String[] args) {
        colorBox box = new colorBox(10,12,1998,"Nova") ;
        box.showBox();
       // wait(4000);
        box.showBox("Color: ");

    }

    /**public static void main(String[] args) {
        RecTest ob = new RecTest(10) ;
        for(int i =0 ; i < 10 ; i++)
            ob.list[i] = i+1 ;

        ob.RecPrint(9);

        /**Box mybox = new Box(10.0, 20.0, 10.0);
        //mybox.setDim(10.0, 20.0, 10.0) ;
        *mybox.length = 10 ;
        mybox.height = 20 ;
        mybox.width = 10 ;


        //System.out.println(mybox.volume()) ;
        System.out.println("My box  " + mybox.length + " " + mybox.width + " " + mybox.height);

          yourbox = mybox.increase() ;

        System.out.println("Your box  " + yourbox.length + " " + yourbox.width + " " + yourbox.height);


        return;
    }*/
};
