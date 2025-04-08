import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        int answer = 0;

        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            Stack<Character> charStack = new Stack<>();

            for (char ch : word.toCharArray()) {
                if (!charStack.isEmpty() && charStack.peek() == ch) {
                    charStack.pop();
                } else {
                    charStack.push(ch);
                }
            }

            if (charStack.isEmpty()) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}