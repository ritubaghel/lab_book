package labBook;
import java.util.function.*;
public class Lab10Exercise3Main {
	public static void main(String[] args) {
		String username="Ritu",password="1234";
		
		BiPredicate<String,String>predicate = (user,pass)->{
			if(user.equals(username)&&pass.equals(password)) {
				return true;
			}
			else
				return false;
		};
	}
}
