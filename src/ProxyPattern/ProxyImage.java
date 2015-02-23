package ProxyPattern;

/**
 * Created by HP on 2/21/2015.
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
