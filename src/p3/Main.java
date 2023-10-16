package p3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d \n", num);
        //double d = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        System.out.print("Input height: ");
        float height = scanner.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);
        scanner.close();
    }
}
