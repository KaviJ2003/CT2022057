import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  String: ");
        String phrase = scan.nextLine();

        int strSize = phrase.length();
        System.out.println(strSize);
        System.out.println(phrase.charAt(0));
        System.out.println(phrase.charAt(strSize - 1));

    }
}
