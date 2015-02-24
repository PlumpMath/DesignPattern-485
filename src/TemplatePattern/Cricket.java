package TemplatePattern;

/**
 * Created by HP on 2/24/2015.
 */
public class Cricket extends Game {

    @Override
    void endPlay(){
        System.out.println("Cricket game finished");
    }

    @Override
    void initialize(){
        System.out.println("Cricket game initialized start playing");
    }

    @Override
    void startPlay(){
        System.out.println("Cricket game started.Enjoy the game !");
   }

}
