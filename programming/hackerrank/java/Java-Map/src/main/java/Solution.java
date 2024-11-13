//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String,Integer> data=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            data.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(data.containsKey(s)){
                System.out.println(s+"="+data.get(s));
            }else{
                System.out.println("Not found");
            }
		}
	}
}


