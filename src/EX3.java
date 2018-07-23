import java.util.Scanner;

public class EX3 {
   public static void main(String[] args) {

    int userNumber = 0;
        int userNumber2 = 0;
        int userNumber3 = 0;
        Scanner gitThe = new Scanner(System.in);
        System.out.print("Enter card number 1: ");
        userNumber = gitThe.nextInt();

        System.out.print("Enter card number 2: ");
        userNumber2 = gitThe.nextInt();

        System.out.print("Enter card number 3: ");
        userNumber3 = gitThe.nextInt();
        if (userNumber + userNumber2 + userNumber3 == 21) {
        System.out.print("BlackJack :");
        } else if (userNumber < 21) {
        System.out.print("The total is:" + (userNumber + userNumber2 + userNumber3));
        } else {
        if (userNumber > 21)
        System.out.print("BUST :");
        }
        }
        }