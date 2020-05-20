import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int size=0;
        String s ;
        while (n >= 0) {
            s = in.nextLine();
            size=s.length();
            if (size <= 10)
                System.out.println(s);
            else {
                System.out.print(s.charAt(0));
                System.out.print(size - 2);
                System.out.println(s.charAt(size-1));
            }
            n--;
        }
    }
}
