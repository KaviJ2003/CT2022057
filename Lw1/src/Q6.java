import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Width: ");
        int screenWidth = sc.nextInt();

        System.out.print("Enter Your Height: ");
        int screenHeight = sc.nextInt();

        JFrame myFrame = new JFrame();
        myFrame.setSize(screenWidth, screenHeight);
        myFrame.setVisible(true);
        myFrame.setTitle("user window");
    }
}