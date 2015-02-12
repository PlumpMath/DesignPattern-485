package AdapterPattern;

/**
 * Created by thushara.wijekoon on 2/12/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
//do nothing
    }
}
