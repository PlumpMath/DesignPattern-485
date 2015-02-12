package BuilderPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

