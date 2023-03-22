package ChapterFive;

import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter length");
//        int length = input.nextInt();

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");

            }
            for (int column = row; column <= 10; column++) {
                System.out.print("  ");

            }
            for (int column = row; column <= 10; column++) {
                System.out.print("* ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");

            }
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");

            }
            for (int column = row; column <= 10; column++) {
                System.out.print("* ");
            }
            for (int column = row; column <= 10; column++) {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}