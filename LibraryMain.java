package labBook;

public class LibraryMain {
public static void main(String [] args) {
	Item item[]=new Item[4];
	Book book=new Book("xyz",1,"JAVA",10);
	item[0]=book;
	Journal journal=new Journal(2014,"fgfgf",4,"efgef",40);
	item[1]=journal;
	VideoCD video=new VideoCD("RK","",2010,20,3,"abc",30);
	item[2]=video;
	AudioCD audio=new AudioCD(20,3,"abc",30,"Shreya","egfh");
	item[3]=audio;
	LibraryMain lib=new LibraryMain();
	lib.display(item);
}
public void display(Item[] item) {
	for(int i=0;i<item.length;i++) {
		Item a=item[i];
		if(a instanceof Book) {
			Book b=(Book)a;
			displayBook(b);
		
			}
			else if(a instanceof Journal) {
				Journal j=(Journal)a;
				displayJournal(j);
			}
			else if(a instanceof VideoCD) {
				VideoCD v=(VideoCD)a;
				displayVideoCD(v);
				
			}			
			else if(a instanceof AudioCD)
			{
				AudioCD a1=(AudioCD)a;
				displayAudioCD(a1);
				
			}
		}
		
	
	}

public void displayBook(Book b) {
System.out.println("Book Details: ");
System.out.println("Book id: "+b.getId());
System.out.println("Book Title: "+b.getTitle());
System.out.println("Book Copies: "+b.getCopies());
}
public void displayJournal(Journal j) {
	System.out.println("Journal Details: ");
	System.out.println("Journal Year: "+j.getYear());
}
public void displayVideoCD(VideoCD v) {
	System.out.println("VideoCD Details: ");
	System.out.println("Director: "+v.getDirector());
	System.out.println("Genre: "+v.getGenre());
	System.out.println("Release Year: "  +v.getYearReleased());
	}
public void displayAudioCD(AudioCD a1) {
	System.out.println("Audio Details: ");
    System.out.println("Artist: "+a1.getArtist());
    System.out.println("Audio Genre: "+a1.getAudioGenre());
}
}
