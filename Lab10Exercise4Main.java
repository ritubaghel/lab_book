package labBook;

public class Lab10Exercise4Main {
	public static void main(String[] args) {
		IExercise4 experiment = Lab10Exercise4::showDetails;
		Lab10Exercise4 experiment1 = experiment.showDetails();
		
		experiment1.setName("Ritu");
		experiment1.setId("1010");
		
		System.out.println("Id :"+experiment1.getId()+" "+"Name :"+experiment1.getName());
	}
}
