package ChapterFive;

public class Triangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int row = 1; row <= 10; row++) {
            for ( int column = 10 ; column >= row; column--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}