package BuilderPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
