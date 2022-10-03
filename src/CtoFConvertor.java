import java.util.Scanner;

public class CtoFConvertor {
    public static void main(String[] args) {
        double ctemp = 0;
        double ftemp = 0;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your temperature in celsius");
        if (in.hasNextDouble()) {
            ctemp = in.nextDouble();
            in.nextLine();
        ftemp = (ctemp * 1.8) + 32;
            System.out.println(" Your temperature in fahrenheit is " + ftemp);
    }else{
            trash = in.nextLine();
                System.out.println(" You entered an invalid temperature in celsius" + trash);
            }

        // (c * 9/5) + 32
    }
}
