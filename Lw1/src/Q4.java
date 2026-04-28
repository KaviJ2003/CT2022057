import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q4 {

    static void main(String args[]) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter set = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(today.format(set));
    }
}
