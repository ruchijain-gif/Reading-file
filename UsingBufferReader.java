package ReadingFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class UsingBufferReader {
	
	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
			String st="";
			br=new BufferedReader(new FileReader("G:\\skillrock\\first.txt"));
			while((st=br.readLine())!=null)
				{
					System.out.println(st);
				}
			} 
			finally
			{
				br.close();
			}
		}
	}