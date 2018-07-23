import java.util.Scanner;

public class EX2{
    public static void main(String[] args) {


        int userNumber = 0;
        Scanner gitThe = new Scanner(System.in);
        System.out.print("Enter number: ");
        userNumber = gitThe.nextInt();

        if (userNumber >= 1) {
            System.out.print("positive:");

        } else if (userNumber <= -1) {
            System.out.print("Negative:");
        } else {
           if (userNumber == 0)
            System.out.print("zero:");
        }
    }
}