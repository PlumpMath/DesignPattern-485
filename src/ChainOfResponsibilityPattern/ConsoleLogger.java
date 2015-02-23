package ChainOfResponsibilityPattern;

/**
 * Created by thushara.wijekoon on 2/23/2015.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}