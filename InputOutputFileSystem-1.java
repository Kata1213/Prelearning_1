import java.io.File;

/**
 * Created by j3n5en on 2018-06-27 18:42.
 */
class InputOutputFileSystem_1 {
    public static void main(String[] args) {
        File file = new File("/");
        for (String name : file.list()) {
            System.out.println(name);
        }
    }
}
