public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int i = 100;
        while (i > 0) {
            boolean isEven = i % 2 == 0;
            if (isEven) {
                i = i/2;
            } else {
                i--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}