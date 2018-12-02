package Algorithm;

import java.io.File;
import java.util.Scanner;

import File_format.Csv2Kml;
import GIS.My_GIS_Project;

public class Multy_CSV {



	public String s = new String();

			public My_GIS_Project run() throws Exception {
		My_GIS_Project project = new My_GIS_Project();		
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
				project.add(n.run());
			}
		}
		System.out.println("Convert finished");
		return project;
		}
	}


}