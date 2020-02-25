package labBook;

public class VideoCD extends MediaItem {
private String director;
private String genre;
private int yearReleased;
public String getDirector() {
	return director;
	
}
public VideoCD(String director, String genre, int yearReleased,int runtime,int id,String title,int copies) {
	super(runtime,id,title,copies);
	this.director = director;
	this.genre = genre;
	this.yearReleased = yearReleased;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYearReleased() {
	return yearReleased;
}
public void setYearReleased(int yearReleased) {
	this.yearReleased = yearReleased;
}
public void setDirector(String director) {
	this.director = director;
}

}
