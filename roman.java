import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integer = romanToInteger(romanNumeral);
        System.out.println("The Roman numeral " + romanNumeral + " is equivalent to the integer " + integer);
    }

    public static int romanToInteger(String romanNumeral) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int integer = 0;
        int prevValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char c = romanNumeral.charAt(i);
            int curValue = map.get(c);
            if (curValue < prevValue) {
                integer -= curValue;
            } else {
                integer += curValue;
            }
            prevValue = curValue;
        }
        return integer;
    }
}
