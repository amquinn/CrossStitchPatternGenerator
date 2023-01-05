public class PatternGenerator {

    public static void main(String[] args) {
        String path = args[0];
        PatternConverter converter = new PatternConverter(path);

        converter.showPattern();
    }
}
