package StrategyPattern;

/**
 * Created by HP on 2/24/2015.
 */
public class StrategyPatternDemo {
    public static void main(String arg[]){
        Context context = new Context(new OperationAdd());
        System.out.println("10+5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationSubstract());
        System.out.println("10-5 = "+ context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+ context.executeStrategy(10, 5));
    }
}
