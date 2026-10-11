
public class MovieReviewWordProfiler {

    static void classifyWordLengths(String review) {
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        String trimmed = review.trim();

        if (trimmed.isEmpty()) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        String[] words = trimmed.split("\\s+");

        for (String word : words) {
            // Count letters only, ignoring punctuation.
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
            int length = cleanWord.length();

            if (length == 0) {
                continue;
            } else if (length <= 4) {
                shortWords++;
            } else if (length <= 8) {
                mediumWords++;
            } else {
                longWords++;
            }
        }

        System.out.println("Short: " + shortWords
                + " | Medium: " + mediumWords
                + " | Long: " + longWords);
    }

    public static void main(String[] args) {
        classifyWordLengths(
            "This movie was absolutely fantastic and thrilling");
    }
}
