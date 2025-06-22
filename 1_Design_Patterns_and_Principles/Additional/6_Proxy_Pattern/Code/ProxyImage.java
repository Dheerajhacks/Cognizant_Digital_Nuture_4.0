import java.util.Map;
import java.util.HashMap;

public class ProxyImage implements Image {

    private static Map<String, RealImage> cache = new HashMap<>();
    private String imgName;

    public ProxyImage(String imgName) {
        this.imgName = imgName;
    }

    public void display() {
        if (cache.containsKey(imgName)) {
            System.out.println("cached image: " + imgName);
            RealImage cachedImage = cache.get(imgName);
            cachedImage.display(); 
        } else {
            System.out.println("Loading image: " + imgName);
            RealImage realImage = new RealImage(imgName);
            cache.put(imgName, realImage); 
            realImage.display(); 
        }
    }    
}
