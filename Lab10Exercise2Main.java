package labBook;
import java.util.stream.Stream;
public class Lab10Exercise2Main {
	public static void main(String[] args) {
		String str="CG";
		String[] str2 = str.split("");
		Stream<String>stream = Stream.of(str2);
		stream.map(arg->arg+" ").forEach(System.out::print);
}
}