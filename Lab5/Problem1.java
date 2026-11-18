import java.util.Scanner;

public class Problem1 {
    public static int generateSecret() {
        return (int) (Math.random() * 50) + 1;
    }

    public static String checkGuess(int guess, int secret) {
        if (guess == secret) {
            return "Correct";
        }
        return guess < secret ? "Higher" : "Lower";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret = generateSecret();
        int[] guesses = new int[5];
        int attempts = 0;
        boolean guessedCorrectly = false;

        while (attempts < guesses.length) {
            System.out.print("Guess a number between 1 and 50: ");
            int guess = input.nextInt();
            guesses[attempts] = guess;
            attempts++;

            String result = checkGuess(guess, secret);
            if (result.equals("Correct")) {
                System.out.println("Correct in " + attempts + " attempts");
                guessedCorrectly = true;
                break;
            }

            System.out.println(result);
        }

        if (!guessedCorrectly) {
            System.out.println("All attempts used. Secret number: " + secret);
        }

        input.close();
    }
}
