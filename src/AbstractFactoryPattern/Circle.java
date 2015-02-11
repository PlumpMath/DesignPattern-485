package AbstractFactoryPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}