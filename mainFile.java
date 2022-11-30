public class mainFile {
    public static void main(String[] args) throws Exception {

        subFile m = new subFile();

        m.openFile();
        m.readFile();
        m.closeFile();

    }
}
