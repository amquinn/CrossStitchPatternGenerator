import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
    PatternConverter takes in the path of a jpeg image and converts it to a cross stitch pattern
 */
public class PatternConverter {
    private String filepath; // filepath of the image to be converted into a pattern
    private int width;
    private int height;
    private BufferedImage image;

    // TODO: move to PatternGenerator and make adjustable
    private final int widthScale = 3;
    private final int heightScale = 3;

    // TODO: move to PatternGenerator and make adjustable
    private final int pixelsPerSquare = 10; // the number of image pixels per cross stitch square

    /*
        1-arg Constructor: filepath to a jpeg file
     */
    public PatternConverter(String path){

        // initialize filepath
        filepath = path;

        // initialize initial buffered image
        try {
            Image img = ImageIO.read(new File(filepath));
            width = img.getWidth(null) / widthScale;
            height = img.getHeight(null) / heightScale;

            // initialize the new image
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            // Draw the image on to the buffered image
            Graphics2D bGr = image.createGraphics();
            bGr.drawImage(img, 0, 0, width, height, null);
            bGr.dispose();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /*
        Returns the generated cross stitch pattern
     */
    public BufferedImage getPattern() {

        // TODO: generate defensive copy
        return image;
    }

    /*
        Displays the generated cross stitch pattern
     */
    public void showPattern() {

        // initialize
        JFrame frame = new JFrame("Cross Stitch Pattern");

        // Use label to display the image
        GridBagLayout gLayout = new GridBagLayout();
        frame.getContentPane().setLayout(gLayout);

        JLabel label = new JLabel(new ImageIcon(image));

        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.CENTER;
        c.weightx = 0.5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        frame.getContentPane().add(label, c);

        frame.pack();
        frame.setVisible(true);
    }

    /*
        Generates a list of the embroidery thread needed to create the pattern
        The generated list is output in a file called filepath/*filename*_thread_list.txt
     */
    public void getList() {
        // TODO: implement
    }
}
