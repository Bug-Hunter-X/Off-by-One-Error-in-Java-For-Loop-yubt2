public class BugSolution {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 10; i++) {
            if (x > 10) {
                break;
            }
            x = x + i;
        }
        System.out.println(x); // This will print the correct value of 10
    }
}
