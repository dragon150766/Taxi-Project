import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)  throws IOException{
		
		try {
			Scanner read = new Scanner(new File("user\\"+"ID"+"Money.txt"));
			while(read.hasNext()) {
			String a1 = read.next();
			
			System.out.print(a1);
			  }
			}
			catch(FileNotFoundException e) {
				System.out.print("A");
			}
			catch(IOException e) {
				System.out.print("B");
			  }
			}

	}

 
