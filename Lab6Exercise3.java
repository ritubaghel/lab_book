package labBook;

public class Lab6Exercise3 {
	
	public static void main(String[]args)
	{
		
		String x="RITU BAGHEL";
		System.out.println(getImage(x));
	
	}
	
	public static String getImage(String n) 
	{ 
		String y=n+"|";
		int j=n.length();
		for(int i=j-1;i>=0;i--)
		{
			y=y+n.charAt(i);
		}
	
		return y;
	}

}
