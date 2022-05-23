import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int wordsize = word.length();
        for (int i = 0; i < wordsize; i++) {
            // python에서 word[i]는 JAVA에서 charAt으로 대체 가능하다!
            System.out.print(word.charAt(i));
            if (i%10 == 9) {
                System.out.println();
            }
        }
    }
}