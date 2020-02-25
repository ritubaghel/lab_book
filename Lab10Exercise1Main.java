package labBook;

public class Lab10Exercise1Main{
	public static void main(String[] args) {
		IExercise1 experiment = (num1,num2)->{
			
			return Math.pow(num1,num2);
		};
	System.out.println(experiment.power(2, 2));
	}
}
