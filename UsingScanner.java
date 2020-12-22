package ReadingFromFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file=null;
    Scanner sc=null;
    try {
    file=new File("G:\\skillrock\\first.txt");   
    sc=new Scanner(file);
    while(sc.hasNextLine())
    {
    	System.out.print(sc.nextLine());
    }
    }
    catch(SecurityException sm)
    {
    	sm.printStackTrace();
    }
    finally
    {
   
    	sc.close();
    }
	}

}