package labBook;



public class Lab4 {
	
	public static void main(String []args) {
		int a= 20;
		System.out.print(digitSumCube(a));
	}
	static int digitSumCube(int arr)
	
	{
		int b=0,digit;
		while(arr>0)
		{
			digit=arr%10;
			arr=arr/10;
			b=b+(digit*digit*digit);
			
		}
		
	
		return b;
	}
	

}
