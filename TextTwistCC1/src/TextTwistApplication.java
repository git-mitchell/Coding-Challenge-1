import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextTwistApplication {

    private static int textTwistScore(String[] guessedWords, String scrambled) throws Exception {
        int score = 0;
        if (scrambled.length() != 6) {
            throw new Exception("Scrambled word must be 6 letters long to score this game");
        }
        for (String word : guessedWords) {
            char[] wordChars = word.toCharArray();
            boolean contains = true;
            List<Character> scrambledChars = scrambled.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
            for (char c : wordChars) {
                if (scrambled.contains(Character.toString(c))) {
                    int index = scrambledChars.indexOf(c);
                    scrambledChars.remove(index);
                }
                else {
                    contains = false;
                }
            }
            if (contains) {
                if (word.length() == 3) {
                    score++;
                }
                else if (word.length() == 4) {
                    score = score + 2;
                }
                else if (word.length() == 5) {
                    score = score + 3;
                }
                else if (word.length() == 6) {
                    score = score + 54;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String scrambled = "gipeam";
        String[] p1 = new String[]{"pie","map","pea","page"};
        String[] p2 = new String[]{"pie","map","mage","magi","game","image"};
        String[] p3 = new String[]{"pie","map","pea","amp","gap","imp","mag","gem","pam","peg","page","mage","magi","game","image","mega","gape","magpie"};
        String[] p4 = new String[]{"pie","map","pea","page","wut"};
        try {
            int p1Score = textTwistScore(p1, scrambled);
            int p2Score = textTwistScore(p2,scrambled);
            int p3Score = textTwistScore(p3,scrambled);
            int p4Score = textTwistScore(p4,scrambled);

            System.out.println("Player 1 Scored " + p1Score + " points!");
            System.out.println("Player 2 Scored " + p2Score + " points!");
            System.out.println("Player 3 Scored " + p3Score + " points!");
            System.out.println("Player 4 Scored " + p4Score + " points!");
            System.out.println("Player 3 Wins!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
