package ChapterSeven;

public class ArraySelf {
        public static void main(String[] args) {
            char[][] array = threeArray();
            pasteArray(array);
            System.out.println();
            String[][] arrayed = Xto1(array);
            printArray(arrayed);
        }

        public static char[][] threeArray() {
            char[][] arr = new char[][] {
                    {'O', 'X', 'O'},
                    {'X', 'O', 'O'},
                    {'X', 'O', 'X'}
            };
            return arr;
        }

        public static void pasteArray(char[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "    ");
                }
                System.out.println();
            }
        }

        public static String[][] Xto1(char[][] arr) {
            String[][] newArr = new String[arr.length][arr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 'X') {
                        newArr[i][j] = "1";
                    } else {
//                    newArr[i][j] = String.valueOf(arr[i][j]);
                        newArr[i][j] = "0";
                    }
                }
            }
            return newArr;
        }

        public static void printArray(String[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "    ");
                }
                System.out.println();
            }
        }
    }

