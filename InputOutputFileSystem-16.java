import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by j3n5en on 2018-06-27 21:21.
 */
class InputOutputFileSystem_16 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("/Users/j3n5en/Downloads/demo.txt", true);
            fileWriter.write("\nInputOutputFileSystem_16\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
