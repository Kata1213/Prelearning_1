/**
 * Created by j3n5en on 2018-06-27 14:30.
 */
class Numbers_9 {
    public static boolean isHappyNum(int num) {
        if (num == 4) return false;
        String str = num + "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Integer.parseInt(str.substring(i, i + 1)),2);
        }
        return sum == 1 || isHappyNum(sum);
    }

    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (count < 10) {
            if (isHappyNum(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

}
