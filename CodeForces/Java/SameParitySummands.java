import java.util.Scanner;
public class SameParitySummands {
    static void print(int a,int size,String s)
    {
        System.out.println(s);
        for(int i=1;i<size;i++)
            System.out.print(a+" ");
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t,k;
        long n;
        t=in.nextInt();
        while(t>0)
        {
            n=in.nextLong();
            k=in.nextInt();
            if(k==1) {
                print(1, k, "YES");
                System.out.println(n);
            }
            else if(k>n)
                System.out.println("NO");
            else if(n==k) {
                print(1, k+1, "YES");
                System.out.print("\n");
            }
            else if((n-k)%2==0)
            {
                print(1,k,"YES");
                System.out.println(n-k+1);
            }
            else if(((n - 2*(k-1))> 0 ) && (n-2*k)%2==0)
            {
                print(2,k,"YES");
                System.out.println(n-2*k+2);
            }
            else
                System.out.println("NO");
            t--;
        }
    }
}


