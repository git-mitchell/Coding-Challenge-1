import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CC3Application {

    private static class Squaremaker {

        public static List<int[]> makeSquare(int d) {
            List<int[]> square = new ArrayList<>();
            for (int i = 0; i < d; i++) {
                int[] row = new int[d];
                for (int j = 0; j < d; j++) {
                    row[j] = d;
                }
                square.add(row);
            }
            return square;
        }

        public static void showSquare(List<int[]> square) {
            for (int[] row : square) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

    public static void main(String[] args) {
        Squaremaker.showSquare(Squaremaker.makeSquare(3));
        Squaremaker.showSquare(Squaremaker.makeSquare(5));
    }
}
