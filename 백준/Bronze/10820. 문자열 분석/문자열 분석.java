import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            int lower = 0, upper = 0, digit = 0, space = 0;

            for (char c : input.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lower++;
                } else if (Character.isUpperCase(c)) {
                    upper++;
                } else if (Character.isDigit(c)) {
                    digit++;
                } else if (c == ' ') {
                    space++;
                }
            }

            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }
    }
}