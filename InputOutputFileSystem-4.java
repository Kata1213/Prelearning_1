import java.io.File;

/**
 * Created by j3n5en on 2018-06-27 19:12.
 */
class InputOutputFileSystem_4 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/demo.txt");
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " can read.");
        }else{
            System.out.println(file.getAbsolutePath() + " cannot read.");
        }
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write.");
        }else{
            System.out.println(file.getAbsolutePath() + " cannot write.");
        }
    }
}
