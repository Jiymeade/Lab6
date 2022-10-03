
import java.util.Scanner;

public class MetricConvertor {
    public static void main(String[] args) {
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter given meters");
        if (in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();
            miles = meters / 1609.344;
            feet = meters * 3.28084;
            inches = meters / 0.0254;
            System.out.println(" Your meters in miles is: " + miles);
            System.out.println(" Your meters in feet is: " + feet);
            System.out.println(" Your meters in inches is: " + inches);
        } else {
            System.out.println("You entered an invalid valued ");
        }
    }
}
