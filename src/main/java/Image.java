import java.net.URL;
import java.util.ArrayList;

public class Image {
    int id;
    String author;
    int width;
    int height;
    URL url;
    URL  download_url;

    @Override
    public String toString() {
        return id + "\n" + author + "\n" + width + "\n" + height + "\n" + url + "\n" + download_url;
    }
}
