package labBook;

public class AudioCD extends MediaItem {
	private String  artist;
	private String audioGenre;
	
		
public AudioCD(int runtime,int id,String title,int copies,String artist, String audioGenre) {
		super(runtime,id,title,copies);
		this.artist = artist;
		this.audioGenre = audioGenre;
	}
public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAudioGenre() {
		return audioGenre;
	}
	public void setAudioGenre(String audioGenre) {
		this.audioGenre = audioGenre;
	}

}
