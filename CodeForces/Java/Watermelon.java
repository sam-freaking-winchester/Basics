import java.util.Scanner;

public class Watermelon
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = in.nextInt();
        if (weight > 2 && weight % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        return ;
    }
}