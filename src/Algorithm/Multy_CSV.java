package Algorithm;

import java.io.File;
import java.util.Scanner;

import File_format.Csv2Kml;

public class Multy_CSV {



	public String s = new String();

			public void run() throws Exception {
		System.out.println("Enter the directory path");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		File fileNew = new File(s);
		File [] list = fileNew.listFiles();
		
		
		if (!fileNew.isDirectory()) {
			throw new Exception("Error in file directory");
		}
		else {
		String check = ".csv";
		for (int i = 0; i < list.length; i++) {
			if (list[i].getName().contains(check)) {
				Csv2Kml n = new Csv2Kml(list[i].getAbsolutePath(), list[i].getName()+".kml"); 
				n.run();
			}
		}
		System.out.println("Convert finished");
		}
	}


}