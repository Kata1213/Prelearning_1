/**
 * Created by j3n5en on 2018-06-27 18:11.
 */
class Numbers_25 {
    public static void main(String[] args) {
        int current = 1;
        int previous = 0;
        System.out.println("First 20 Pell numbers:");
        for (int i = 0; i <= 19; i++) {
            int last = current + 2 * previous;
            System.out.print(last + " ");
            current = previous;
            previous = last;
        }
    }
}
