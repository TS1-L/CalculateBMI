import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        float height;
        float weight;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        height = input.nextFloat();

        System.out.print("Enter your weight: ");
        weight = input.nextFloat();

        System.out.println("Your BMI (Body Mass Index) is: " + weight/(height*height));


    }
}
