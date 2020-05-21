import java.util.Scanner;
public class KthNotDivisibleByN {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        long n,k,ans;
        while(t>0)
        {
            n=in.nextLong();
            k=in.nextLong();
            ans=(k/(n-1))*n+(k%(n-1));
            if((k%(n-1)==0))ans--;
            System.out.println(ans);

            t--;
        }
    }
}
