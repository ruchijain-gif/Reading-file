package ReadingFromFile;

import java.io.*;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try {
			fr=new FileReader("G:\\skillrock\\first.txt");
			int ch;
			while((ch=fr.read())!=-1)
			{
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        

	}

}