public class Main {

    public static int triangle(int n) {
        int currentTotal = 0;

        for(int i = 1; i <= n; i++) {
             currentTotal = currentTotal + i;

        }

        return currentTotal;
    }

    public static void main(String[] args) {
        System.out.println("Answer: " + triangle(1));
        System.out.println("Answer: " + triangle(6));
        System.out.println("Answer: " + triangle(215));
    }
}