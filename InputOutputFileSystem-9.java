import java.io.File;

/**
 * Created by j3n5en on 2018-06-27 20:42.
 */
class InputOutputFileSystem_9 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads/synology.dmg");
        if (!file.exists()) {
            System.out.println("No such file or directory.");
            return;
        }
        long bytes = file.length();
        long kb = bytes / 1024;
        long mb = kb / 1024;
        System.out.println(bytes + " bytes");
        System.out.println(kb + " kb");
        System.out.println(mb + " mb");
    }
}
