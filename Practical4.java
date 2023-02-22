import java.util.Scanner;

public class Practical4 {
    public static void main(String a[]) {
        int max = 0, second_max = 0, temp, numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        numbers = scanner.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers; i++) {
            if (i == 0) {
                max = scanner.nextInt();
            } else {
                temp = scanner.nextInt();
                if (temp > max) {
                    second_max = max;
                    max = temp;
                }
                else if(temp>second_max)
                {
                 second_max=temp;
                }
            }
        }
        scanner.close();
        System.out.println("Second max number is :" + second_max);
    }
}