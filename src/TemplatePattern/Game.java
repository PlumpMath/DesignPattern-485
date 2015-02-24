package TemplatePattern;

/**
 * Created by HP on 2/24/2015.
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //template method
    public final void play(){
        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }
}
