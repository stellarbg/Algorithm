import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        StringBuilder pattern = new StringBuilder(arr[0]);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (pattern.charAt(j) != arr[i].charAt(j)) {
                    pattern.setCharAt(j, '?');
                }
            }
        }

        System.out.println(pattern);
    }
}