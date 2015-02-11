package AbstractFactoryPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
