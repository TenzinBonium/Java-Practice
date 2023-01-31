import java.util.Scanner;

public class CodeWin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String s = input.next();
        System.out.println(n * 2 + "\n" + s);
        input.close();
    }
}