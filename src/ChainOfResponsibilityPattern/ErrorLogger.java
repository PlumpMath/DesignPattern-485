package ChainOfResponsibilityPattern;

/**
 * Created by thushara.wijekoon on 2/23/2015.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
