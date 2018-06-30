import java.io.*;

/**
 * Created by j3n5en on 2018-06-27 21:23.
 */
class InputOutputFileSystem_17 {
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream("/Users/j3n5en/Downloads/demo.txt")));
            String sLine;

            while ((sLine = lineNumberReader.readLine()) != null && lineNumberReader.getLineNumber() <= 3) {
                System.out.println(sLine);
            }
            lineNumberReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("No such file or directory.");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
