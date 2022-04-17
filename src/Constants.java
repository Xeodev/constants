import java.util.Scanner;

public class Constants {

    public static void main (String [] args){

        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        
        System.out.println();
        System.out.println("Standard paper size in centimetres is: " + paperWidth * CM_PER_INCH + "  by  " +paperHeight *CM_PER_INCH);
        System.out.println();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter width in inches of paper ");
        System.out.println();
        paperWidth = keyboard.nextDouble();

        System.out.println("Enter height in inches of paper ");
        System.out.println();
        paperHeight= keyboard.nextDouble();

        calculateDimensions(paperWidth, paperHeight);
        System.out.println("Custom paper size in centimetres is: " + paperWidth * CM_PER_INCH + "  by  " +paperHeight *CM_PER_INCH);

    }

    private static double calculateDimensions(double paperWidth, double paperHeight){

        double calulation = paperWidth * paperHeight;
        System.out.println();
        System.out.println( "Area of your custom paper is " + calulation);

        return calulation;

    }

}
