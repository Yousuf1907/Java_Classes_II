import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentYr = Year.now().getValue();

        System.out.println("Enter the Year you were born: ");
        int birthYr = sc.nextInt();

        int age = currentYr - birthYr;
        System.out.println("At present time, You are " + age + " years old.");

        sc.close();
    }
}
