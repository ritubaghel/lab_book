package labBook;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgramExecutor {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();	//using executor
		
		try{
		String inputPath = "D:\\capg\\source.txt";
		Reader reader = new FileReader(inputPath);
		String outputPath ="D:\\capg\\target.txt";
		Writer  writer = new FileWriter(outputPath);
		
		Runnable thread1 = new CopyDataThread(reader,writer);
		executor.submit(thread1);
		
		}
		
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}