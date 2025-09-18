import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Shape you want to calculate the area of it: ");
        System.out.println("\n");
        System.out.print("Choose between  1.Circle   2.Rectangle   3.Triangle : ");

        String input = scanner.nextLine();

        System.out.println("You Choose: " + input);

    try{

        if (input.equals("Circle")) {

            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            Shape Shape1 = new Circle(radius);
            Shape1.calculateArea();
        }

       else if (input.equals("Rectangle")) {

            System.out.print("Enter length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width of the rectangle: ");
            double width = scanner.nextDouble();

            Shape Shape2 = new Rectangle(length, width);
            Shape2.calculateArea();
        }

       else if(input.equals("Triangle")){

            System.out.print("Enter base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter height of the triangle: ");
            double height = scanner.nextDouble();

            Shape Shape3 = new Triangle(base, height);
            Shape3.calculateArea();
        }
        else{
            System.out.println("Invalid choice!");
        }
    }
     catch(Exception e){
         System.out.println("Invalid Input!, Try Again");
        }
    }
}