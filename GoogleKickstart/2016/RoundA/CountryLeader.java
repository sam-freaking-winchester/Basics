import java.util.*;

public class CountryLeader
{
    static int getMaxChars(String st)
    {
        char t;
        HashSet<Character> c=new HashSet<Character>();
        for(int i=0;i<st.length();i++)
        {
            t=st.charAt(i);
            if(t>='A' && t<='Z')
                c.add(t);
        }
        return c.size();
    }
    public static void main(String[] args)
    {
        TreeSet<String> names=new TreeSet<String>();
        String name="",t;
        Scanner in= new Scanner(System.in);
        int temp,max=0,index,n,tests=in.nextInt();
        for(int k=1;k<=tests;k++)
        {
            max=0;
            name="";
            n=in.nextInt();
            in.nextLine();
            for(index=0;index<n;index++) {
                names.add(in.nextLine());
            }
            Iterator<String> it= names.iterator();
            index=0;
            while(it.hasNext())
            {
                t=it.next();
                temp=getMaxChars(t);
                if(temp>max)
                    name=t;
                index++;
            }
            System.out.println("Case #"+k+": "+name);
        }
    }
}