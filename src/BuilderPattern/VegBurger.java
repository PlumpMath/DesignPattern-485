package BuilderPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }
    @Override
    public String name() {
        return "Veg Burger";
    }
}
