package AbstractFactoryPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
