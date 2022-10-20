public class Test {
    public static void main(String[] args) {
        collatz(42);
    }

    public static void collatz(int start) {
        System.out.println(start);
        if (start == 1) return;
        collatz(start % 2 == 0 ? start / 2 : start * 3 + 1);
    }
}