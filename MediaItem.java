package labBook;

public abstract class MediaItem extends Item {
int runtime;

public int getRuntime() {
	return runtime;
}

public void setRuntime(int runtime) {
	this.runtime = runtime;
}

public MediaItem(int runtime,int id,String title,int copies) {
	super(id,title,copies);
	this.runtime = runtime;
}

}
