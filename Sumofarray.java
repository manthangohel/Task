import java.util.Scanner;

public class Sumofarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        double sum = 0;
        double avg = 0;

        System.out.println("Enter the 5 array element");
        for (int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<len;i++){
            sum += arr[i];
        }
        avg = sum/len;
        System.out.println("Sum of "+len+" number in "+sum);
        System.out.println("Average is "+avg);
    }
}