package MementoPattern;

/**
 * Created by thushara.wijekoon on 2/23/2015.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
