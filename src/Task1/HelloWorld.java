package Task1;

public class HelloWorld {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print("Hello" + " ");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.print("World" + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
