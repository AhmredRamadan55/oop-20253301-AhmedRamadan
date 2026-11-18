import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] grid = new char[3][4];

        System.out.print("Enter 3 words (4 letters each): ");
        for (int row = 0; row < grid.length; row++) {
            String word = input.next();
            for (int column = 0; column < grid[row].length; column++) {
                grid[row][column] = word.charAt(column);
            }
        }

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print(grid[row][column]);
                if (column < grid[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.print("Columns: ");
        for (int column = 0; column < grid[0].length; column++) {
            String columnWord = "";
            for (int row = 0; row < grid.length; row++) {
                columnWord = columnWord.concat(String.valueOf(grid[row][column]));
            }
            System.out.print(columnWord);
            if (column < grid[0].length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        int vowelCount = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if ("aeiou".indexOf(grid[row][column]) != -1) {
                    vowelCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);

        input.close();
    }
}
