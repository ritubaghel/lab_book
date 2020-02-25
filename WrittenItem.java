package labBook;

public abstract class WrittenItem extends Item {
private String author;

public WrittenItem() {
	
}
public WrittenItem(String author,int id,String title,int copies) {
	super(id,title,copies);
	this.author=author;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
}
