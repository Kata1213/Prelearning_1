import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by j3n5en on 2018-06-27 18:43.
 */
class InputOutputFileSystem_2 {
    public static void main(String[] args) {
        File file = new File("/Users/j3n5en/Downloads");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".zip");
            }
        });
        for (String name : list) {
            System.out.println(name);
        }
    }
}
