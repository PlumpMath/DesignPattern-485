package ProtoypePattern;

/**
 * Created by thushara.wijekoon on 2/12/2015.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
