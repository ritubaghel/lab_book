package labBook;
import java.util.*;
public class Lab6Exercise1 {

	public static void main(String []args)
	{
		
		String s=new String();
		s="1 2 3 4 5 6 7 8 9";
		int sum=0;
		
		String arr[]=s.split(" ");
		
		for (int i=0;i<arr.length;i++) {
			sum=sum+Integer.parseInt(arr[i]);
			System.out.println(arr[i]);
		}
		
		System.out.println("The sum of integer is :"+sum);
	}
	
}
