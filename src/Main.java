import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int user = 0;
        Scanner gitThe = new Scanner(System.in);
        System.out.print("Enter number: ");
        int userNumber = gitThe.nextInt();

        if ((userNumber >= 1) && (userNumber <= 3)) {
            System.out.print("correct:");

        } else {
            System.out.print("error!!! ");
        }
    }
}