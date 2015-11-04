/**
 * Created by MD on 23/09/2015.
 * Java has no destructor method
 * It has finalize method
 * Java stack uses FILO method
 * Protected applies only when inheritance involved
 */
public class Box {
    public double length ;
    public double width ;
    public double height ;

    Box(double length,double width, double height){
        System.out.println("Constructing...!!");
        this.length = length ;
        this.width = width ;
        this.height = height ;
    }

    public void setDim(double length,double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
     double volume(){
        return this.length * this.width * this.height ;
    }

    public Box increase(){
        Box temp = new Box(2 * length , 2 * width ,2 * height) ;
        return temp ;
    }

    public void showBox(){
        try {
            wait(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.length + " " + this.width + " " + this.height);
    }


};
