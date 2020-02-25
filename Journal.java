package labBook;

public class Journal extends WrittenItem {
private int year;
public Journal(int year) {
	this.year=year;
}
public Journal(int year,String author,int id,String title,int copies) {
	super(author,id,title,copies);
	this.year=year;
}


public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}
