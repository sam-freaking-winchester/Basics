import java.util.Scanner;
public class NextRound {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int i,s=k-1,a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        if(a[s]==0){
            s=0;
            while(a[s]>0) {
                s++;
            }
        }
        else {
            while (s < n && a[s] == a[k - 1])
                s++;
        }
        System.out.println(s);
    }
}
