package labBook;
import java.util.function.*;	
public class Lab10Exercise5 {
	
	public static void main(String[] args) {
		Function<Integer,Integer>function =Lab10Exercise5::factorial;
		int result=function.apply(3);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		return fact;
	}
}
