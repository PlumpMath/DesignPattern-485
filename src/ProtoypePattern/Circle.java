package ProtoypePattern;

/**
 * Created by thushara.wijekoon on 2/12/2015.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
