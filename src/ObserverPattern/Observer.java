package ObserverPattern;

/**
 * Created by thushara.wijekoon on 2/23/2015.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
