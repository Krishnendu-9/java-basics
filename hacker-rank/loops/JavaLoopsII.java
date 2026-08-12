import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();

        for (int i = 0; i < queries; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int term = a;
            for (int j = 0; j < n; j++) {
                term += (int) (Math.pow(2, j) * b);
                System.out.print(term + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
