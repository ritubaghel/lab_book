package labBook;

public class Lab10Exercise4 {
	
	private String id;
	private String name;
	
	public Lab10Exercise4(){
		this(" "," ");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Lab10Exercise4(String id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public static Lab10Exercise4 showDetails() {
		return new Lab10Exercise4();
	}
}
