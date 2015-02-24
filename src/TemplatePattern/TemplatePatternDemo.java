package TemplatePattern;

/**
 * Created by HP on 2/24/2015.
 */
public class TemplatePatternDemo {
    public static void main(String arg []){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
