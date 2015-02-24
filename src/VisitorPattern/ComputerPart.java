package VisitorPattern;

/**
 * Created by HP on 2/24/2015.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
