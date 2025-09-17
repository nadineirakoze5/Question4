import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Shape you want to calculate the area of it: ");
        System.out.println("\n");
        System.out.print("Choose between  1.Circle   2.Rectangle   3.Triangle : ");

        String input = scanner.nextLine();

        System.out.println("You Choose: " + input);

        if (input.equals("Circle")) {
            Shape Shape1 = new Circle(2.5);
            Shape1.calculateArea();
        }

       else if (input.equals("Rectangle")) {
            Shape Shape2 = new Rectangle(6.9, 3.3);
            Shape2.calculateArea();
        }

       else if(input.equals("Triangle")){
            Shape Shape3 = new Triangle(4.5, 5.5);
            Shape3.calculateArea();
        }
       else{
            System.out.println("Invalid choice!");
        }
    }
}