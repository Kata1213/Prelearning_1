import java.io.File;

/**
 * Created by j3n5en on 2018-06-27 19:11.
 */
class InputOutputFileSystem_3 {
    public static void main(String[] args) {
        File hostsFile = new File("/etc/hosts");
        if (hostsFile.exists()) {
            System.out.println("The directory or file exists.");
        }
        else {
            System.out.println("The directory or file does not exist.");
        }
    }
}
