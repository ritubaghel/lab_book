package labBook;
import java.util.Arrays;
public class Lab3Exercise3 {

	
		
		public static void main(String []args) {
			int array[]= {143,542,14324,2444,74534,6543,6790,1078};
			System.out.print(Arrays.toString(getSorted(array)));
		}
		static int[] getSorted(int arr[])
		{
			for (int i=0;i<arr.length;i++)
			{int reversed=0;
				for(;arr[i] != 0;  arr[i]/= 10) {
		            int digit = arr[i] % 10;
		            reversed = reversed * 10 + digit;
		            
		        }
				arr[i]=reversed;
			}
		Arrays.sort(arr);
		return arr;
		}
		
	

	
	
}
