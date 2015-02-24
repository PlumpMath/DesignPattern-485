package StrategyPattern;

/**
 * Created by HP on 2/24/2015.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation (int num1,int num2){
        return num1-num2;
    }
}
