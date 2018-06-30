import java.io.File;
import java.util.Date;

/**
 * Created by j3n5en on 2018-06-27 20:30.
 */
class InputOutputFileSystem_7 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        System.out.println("Last modified: " + new Date(file.lastModified()));
    }

}
