/**
 * Created by MD on 24/09/2015.
 */
public class colorBox extends Box {
    private String color;

    colorBox(double length, double width, double height, String color) {
        super(length, width, height);
        super.length = length;
        this.color = color;
    }

    public void showBox(String msg) {
        System.out.println(msg + this.color);
    }

}