import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();

            int count = 0;

            for (char c : str.toCharArray()) {
                if (c == '!') {
                    count++;
                } else {
                    break;
                }
            }

            if (str.contains("0")) {
                if ((str.length() - 1) - count != 0) {
                    if (count % 2 == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else {
                    if (count % 2 == 0) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                }
            } else {
                if (count % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        }
    }
}