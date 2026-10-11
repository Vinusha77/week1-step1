
public class TrafficSignalAnalyzer {

    static void findLongestStreak(String signalLog) {
        if (signalLog.isEmpty()) {
            System.out.println("No signal readings available.");
            return;
        }

        char currentColor = signalLog.charAt(0);
        int currentLength = 1;

        char longestColor = currentColor;
        int longestLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char color = signalLog.charAt(i);

            if (color == currentColor) {
                currentLength++;
            } else {
                currentColor = color;
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestColor = currentColor;
            }
        }

        System.out.println("Longest Streak: '" + longestColor
                + "' repeated " + longestLength + " times");
    }

    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
    }
}
