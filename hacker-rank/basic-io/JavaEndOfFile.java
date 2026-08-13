import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(n + " " + line);
            n++;
        }
        sc.close();
    }
}
