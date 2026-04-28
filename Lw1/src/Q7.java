import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm.ss a");

        JFrame displayFrame = new JFrame();
        displayFrame.setTitle(currentTime.format(timeFormatter));
        displayFrame.setSize(600, 600);
        displayFrame.setVisible(true);
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
