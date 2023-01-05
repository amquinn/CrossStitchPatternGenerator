import java.awt.image.BufferedImage;
import java.util.TreeMap;

public class DMCMatcher {

    private TreeMap<Integer, Integer[]> DMCLibrary; // key = DMC ID, value = rgb

    public DMCMatcher() {

        // TODO: nothing?
    }

    /*
        Takes a cross stitch pattern and matches each square with DCM thread color,
        generating a TreeMap where key = DMC ID, value = qty of squares
     */
    public TreeMap<Integer, Integer> generateList(BufferedImage image) {
        TreeMap<Integer, Integer> result = new TreeMap<>();

        // TODO: implement

        return result;
    }
}
