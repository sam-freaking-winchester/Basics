import java.util.Scanner;

import static java.lang.Math.ceil;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l = in.nextInt();
        double b = in.nextInt();
        double a = in.nextInt();
        System.out.println((long)(ceil(l/a)*ceil(b/a)));
        return;
    }
}
