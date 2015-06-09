import java.io.*;
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c:\\myfile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int k;
		
	
		
		try {
			while((k=fis.read())!=-1)
			{
				System.out.println((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
