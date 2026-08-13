import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String value = sc.next();

            try {
                long num = Long.parseLong(value);
                System.out.println(value + " can be fitted in:");
              
                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");

            } catch (NumberFormatException e) {
                System.out.println(value + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
