package labBook;

import java.io.*;

public class CopyDataThread implements Runnable {

	Reader reader;
	Writer writer;

	public CopyDataThread(Reader reader, Writer writer) {
		this.reader = reader;
		this.writer = writer;
	}

	@Override
	public void run() {
		try{			
	
				int readChar;
				int count=0;
				while((readChar =reader.read())>0) {
					writer.write(readChar);
					count++;
					if(count%10==0) {
						System.out.println("10 Characters are Copied!");
						Thread.sleep(5000);
					}
					
				}
			
		
	}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
