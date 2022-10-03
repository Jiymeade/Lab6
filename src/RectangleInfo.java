import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash;

        //area = length * width
        // perimeter = 2* length + 2 * width
        //diagonal = Square root (length + length + width+ width)
        Scanner in = new Scanner(System.in);

        System.out.println(" Enter the length of the Rectangle");
        if(in.hasNextDouble()){
            length = in.nextDouble();
            in.nextLine();
            System.out.println(" Enter the width of the Rectangle");
            if(in.hasNextDouble()){
                width = in.nextDouble();
                in.nextLine();
                diagonal = Math.sqrt(length * length + width * width );
                area = length * width;
                perimeter = (2 * length) + (2 * width);

                System.out.printf("The area of the rectangle %f%n", area);
                System.out.printf("The perimeter of the rectangle %f%n", area);
                System.out.printf("The diagonal of the rectangle %f%n", area);

            }else{
                trash = in.nextLine();
                System.out.println(" You entered an invalid width value" + trash);
            }
        }else{
            trash = in.nextLine();
            System.out.println("You entered an invalid length value" + trash);
        }

    }
}
