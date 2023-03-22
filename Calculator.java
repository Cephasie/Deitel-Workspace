package ChapterFive;

import java.util.Scanner;

public class Calculator {

    public  void prompt() {
        Scanner scanner = new Scanner(System.in);
        int options;
        options = 0;
        while (options != 5) {
            System.out.println("""
            1. Addition 
            2. Subtraction 
            3. Division 
            4. Multiplication 
            5. Exit""");

            System.out.println("enter your option");
            options = scanner.nextInt();
            switch (options) {
                case 1:
                    Add();
                    break;

                case 2:
                    Subtract();
                    break;

                case 3:
                    Divide();
                    break;

                case 4:
                   Multiply();
                    break;

                case 5:
                    Exit();

                default:
                    System.out.println("Invalid input!!!");
                    prompt();

            }
        }
    }

    public void Add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        int num1 = scanner.nextInt();
        System.out.println("enter second value");
        int num2 = scanner.nextInt();
        System.out.println("Result = " +(num1 + num2));

    }

    public void Subtract(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        int num1 = scanner.nextInt();
        System.out.println("enter second value");
        int num2 = scanner.nextInt();
        System.out.println("Result = " +(num1 - num2));
    }

    public void Divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        int num1 = scanner.nextInt();
        System.out.println("enter second value");
        int num2 = scanner.nextInt();
        System.out.println("Result = " +(num1 / num2));
    }

    public void Multiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first value");
        int num1 = scanner.nextInt();
        System.out.println("enter second value");
        int num2 = scanner.nextInt();
        System.out.println("Result = " +(num1 * num2));
    }

    public void Exit(){
        System.exit(0);
    }

}
