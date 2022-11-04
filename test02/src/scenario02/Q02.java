package scenario02;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Q02 {
	
	public void output() {

//		try(FileWriter fw = new FileWriter("test.txt", true)) {
//
//			fw.write(97);
//			fw.write(65);
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("D:\\test.txt", true)) {

			fw.write(97);
			fw.write(65);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("D:\\test.txt", true);
//			fw.write(97);
//			fw.write(65);
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

}
