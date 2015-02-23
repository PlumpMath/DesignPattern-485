package NullObjectPattern;

/**
 * Created by HP on 2/23/2015.
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean isNil(){
        return false;
    }
}
