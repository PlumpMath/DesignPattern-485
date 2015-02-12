package BuilderPattern;

/**
 * Created by thushara.wijekoon on 2/11/2015.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
