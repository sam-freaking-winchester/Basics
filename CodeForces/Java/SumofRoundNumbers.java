import java.util.Scanner;
import java.util.ArrayList;

public class SumofRoundNumbers {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t,number,s;
        ArrayList<Integer> ans =new ArrayList<Integer>(5);
        t=in.nextInt();
        while (t > 0) {
            number=in.nextInt();
            s=10;
            while(number>0){
                if(number%s>0)
                {
                        ans.add(number%s);
                        number-=(number%s);
                }
                s*=10;
            }
            System.out.println(ans.size());
            for(int i=0;i<ans.size();i++) {
                System.out.print(ans.get(i)+" ");
                }
            ans.clear();
            t--;
        }
    }
}
