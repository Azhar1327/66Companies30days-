public class Question_3 {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] counts = new int[10];

        // Count the number of bulls
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                // Increment the count for the digit in the secret number
                counts[secret.charAt(i) - '0']++;
            }
        }

        // Count the number of cows
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                // Decrement the count for the digit in the guess if it is present in the secret number
                if (counts[guess.charAt(i) - '0'] > 0) {
                    cows++;
                    counts[guess.charAt(i) - '0']--;
                }
            }
        }

        // Return the hint
        return bulls + "A" + cows + "B";
}
