import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        final Gson gson = new Gson();
        URL f = new URL("https://picsum.photos/v2/list");
        BufferedReader in = new BufferedReader(new InputStreamReader(f.openStream(), StandardCharsets.UTF_8));
        Image[] i = gson.fromJson(in, Image[].class);
        FileWriter fw = new FileWriter("/home/INFORMATICA/alu10637835/IdeaProjects/ejercicios/json2/src/main/java/a1.html");
        fw.write("<html><body>\n");
        fw.write("<h1>Imagenes</h1>\n");
        for (Image image : i) {
            fw.write("<div>\n");
            fw.write("<h2>Image: " + image.id + "</h2>\n");
            fw.write("<p>Author: " + image.author + "</p>\n");
            fw.write("<p>Width: " + image.width + "</p>\n");
            fw.write("<p>Height: " + image.height + "</p>\n");
            fw.write("<img src=\"" + image.download_url + "\" width=\"" + 400 + "\" height=\"" + 250 + "\"></img>\n");
            fw.write("</div>\n");
        }
        fw.write("</body></html>");
        fw.close();
    }
}
