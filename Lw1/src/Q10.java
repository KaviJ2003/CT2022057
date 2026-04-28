import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Odd length  string : ");
        String userText = keyboard.nextLine();

        while (userText.length() % 2 == 0) {
            System.out.println("The String isnt Odd lenghth ...!");
            System.out.println("Enter a string : ");
            userText = keyboard.nextLine();
        }

        int middleIndex = userText.length() / 2;
        System.out.println(userText.charAt(middleIndex));
    }
}