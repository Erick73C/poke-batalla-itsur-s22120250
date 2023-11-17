package mx.edu.itsur.pokebatalla.Graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Erick Omar Perez Gonzalez s22120250
 */
public class Loader {
      public static BufferedImage ImageLoader(String path)
    {
        try {
            return ImageIO.read(Loader.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace ();    
        }
        return null;
    }
}
