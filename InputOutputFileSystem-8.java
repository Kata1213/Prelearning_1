import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by j3n5en on 2018-06-27 20:34.
 */
class InputOutputFileSystem_8 {
    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input your name: ");
        String name = bufferedReader.readLine();
        System.out.println("Your name is: " + name);
    }
}
