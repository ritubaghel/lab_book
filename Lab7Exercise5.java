package labBook;
import java.util.Arrays;

public class Lab7Exercise5 {
	
	public static void main(String []args) {
		int array[]= {9,5,4,2,7,8,1,10};
		System.out.print(getSecondSmallest(array));
	}
	
	static int getSecondSmallest(int arr[])
	{
		Arrays.sort(arr);
		return arr[1];
	}
	
}
