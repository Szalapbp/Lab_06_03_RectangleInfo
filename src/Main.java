
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main
{

    public static void main(String[] args)
    {
	double lengthRectangle = 0;
    double widthRectangle = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("What is the length of the rectangle?: ");
        lengthRectangle = in.nextDouble();

        System.out.print("What is the width of the rectangle?: ");
        widthRectangle = in.nextDouble();

        double area = lengthRectangle * widthRectangle;
        double lengthSq = lengthRectangle * lengthRectangle;
        double widthSq = widthRectangle * widthRectangle;
        double diagonal = sqrt(widthSq + lengthSq);

        System.out.println("The area of the Rectangle is " + area);
        System.out.println("The length of the diagonal is " + diagonal);





    }
}
