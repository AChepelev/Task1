package Task1;

public class StringMethod {

    public static void main(String[] args) {

        stringOutput();
    }

    public static String stringOutput () {
        String res = "";
        for (int i = 1; i <= 30; i++) {
            res += "(" + i + ") ";
        }
        System.out.println(res);

        return res;
    }
}