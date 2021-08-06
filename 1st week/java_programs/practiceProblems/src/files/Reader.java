package files;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
		
   FileInputStream in= new FileInputStream("C:\\Users\\ankit\\Pictures\\pins\\dbg_1.png");
   FileOutputStream o = new FileOutputStream("C:\\Users\\ankit\\Documents\\copy.png");
   BufferedInputStream B=new BufferedInputStream(in);
   BufferedOutputStream Bo= new BufferedOutputStream(o);
   
   int a =0;
   while(a!=-1) {
	   a=B.read();
	   Bo.write(a);
   }
   B.close();
   Bo.close();
		}
		 catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}