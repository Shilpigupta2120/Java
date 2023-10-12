import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to check if it's a pangram or not: ");
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("Yes, the input is a pangram.");
        } else {
            System.out.println("No, the input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        boolean[] alphabets = new boolean[26];
        int index;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';
            } else if (c >= 'a' && c <= 'z') {
                index = c - 'a';
            } else {
                continue;
            }
            alphabets[index] = true;
        }
        for (boolean b : alphabets) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
