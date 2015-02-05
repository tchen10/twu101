import java.lang.Integer;
//Print the sum of all odd numbers from 1 to 100
class Ch1 {
    public static void main (String[] args) {

        int num = 1;
        int sum = 0;

        while (num < 100) {
            if (num % 2 == 1) {
                sum = sum + num;
            }
            num += 1;
        }

        System.out.println(sum);
    }
}