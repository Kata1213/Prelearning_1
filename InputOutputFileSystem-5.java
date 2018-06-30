import java.io.File;

/**
 * Created by j3n5en on 2018-06-27 19:15.
 */
class InputOutputFileSystem_5 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        System.out.print(file.getAbsolutePath());
        System.out.println((file.isDirectory() ? " " : " not ") + "a directory");
        System.out.print(file.getAbsolutePath());
        System.out.println((file.isFile() ? " " : " not ") + "a file");
    }
}
