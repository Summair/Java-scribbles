/* 6/7/2018 
 * 
 *  M.Brohi

 * following is a program that will access a file or any index, it uses writeWords() method to alter content
 * 
 */

import java.io.*;


public class StringPath {

	public static void main(String[] args)  throws IOException {
		
		writeWords("yourdatafile.data" , args); 
	
		// pulls your data file 
		
		StringPath list = new StringPath("yourdatafile.data");
		//method to object of your .data file
		

		
		for (int i = list.size()-1; i >=0; i--)
			System.out.println(list.get(i));
		
		//first loop to print backwards
		
		list.close();
	}
	
	//now defining the methods
public static void writeWords(String filename, String[] words) throws IOException {
	
	RandomAccessFile f = new RandomAccessFile(filename, "rw");

	long wordPositions[] = new long[words.length];

	//word positions array 4 bytes for length 8 bytes
		f.seek(4L +(8 * words.length));

		for( int i = 0; i <words.length; i++) {
			
			wordPositions[i] = f.getFilePointer();
			
			f.writeUTF(words[i]);
			
		}
// loop will go to start of the file and write the positions seperately
		f.seek(0L);
		f.writeInt(wordPositions.length);
		for(int i = 0; i < wordPositions.length; i++)
			f.writeLong(wordPositions[i]);
		f.close();

}

	RandomAccessFile f;
	long[] positions;

	public StringPath(String filename) throws IOException {
		
		f = new RandomAccessFile (filename, "r");
		
		int numwords = f.readInt();
		positions = new long[numwords];
		
		for(int i = 0; i< numwords; i++)
			positions[i] = f.readLong();
	}
	
	// methods that will give you close(), size(), get() values on the file.
	
	public void close() throws IOException{
		if (f != null) 
			
			f.close();
		f = null;
		positions = null;
	}
	
	public int size() {
		
		if (f == null) throw new IllegalStateException("already closed");
		return positions.length;
	}
	
	public String get(int i) throws IOException {
		
		if (f == null) throw new IllegalStateException("already closed");
		f.seek(positions[i]);
		return f.readUTF();
		
	}
	
	
	
}
