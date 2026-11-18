import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];

        System.out.print("Enter 9 cells (X or O): ");
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = input.next().charAt(0);
            }
        }

        int xCount = 0;
        int oCount = 0;
        boolean xHasFullRow = false;

        for (int row = 0; row < board.length; row++) {
            int xInRow = 0;
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column]);
                if (column < board[row].length - 1) {
                    System.out.print(" ");
                }

                if (board[row][column] == 'X') {
                    xCount++;
                    xInRow++;
                } else if (board[row][column] == 'O') {
                    oCount++;
                }
            }
            System.out.println();

            if (xInRow == board[row].length) {
                xHasFullRow = true;
            }
        }

        System.out.println("X count: " + xCount);
        System.out.println("O count: " + oCount);
        if (xHasFullRow) {
            System.out.println("X has a full row");
        } else {
            System.out.println("No full X row");
        }

        input.close();
    }
}
