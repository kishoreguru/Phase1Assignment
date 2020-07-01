package Service;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileManipulation {
	
	public void display() {
		
		 Scanner scan = new Scanner(System.in);
		  
		 System.out.println("Enter path of directory:");
	     
		 String directory = scan.nextLine();
	     File directoryPath = new File(directory);
	     
	     if(directoryPath.isDirectory()){
				List File = Arrays.asList(directoryPath.list());
			
				Collections.sort(File);
				System.out.println("Sorting by filename in ascending order");
				
				for(Object f:File){
					System.out.println("					  * "+f);
				}
			}
	     scan.close();
	}
	public void create() throws IOException {
		
		boolean ref = false;
		System.out.println("Enter path of directory:");
		Scanner scan = new Scanner(System.in);  
		
		String directory = scan.nextLine();
	    File directoryPath = new File(directory);

	    System.out.println("Enter file name to be created:");
	    String fileName = scan.nextLine();
	    
	    File f = new File(directoryPath,fileName +".txt");
	      if (f.exists()) {
	          System.out.println("File already exists");

	      } else {
	          System.out.println("No such file exists............!");
	          System.out.println("creating now in .txt format");
	          ref = f.createNewFile();
	          if (ref) {
	              System.out.printf("Successfully created new file: %s%n ", f);
	          } else {
	              System.out.printf("Failed to create new file: %s%n", f);
	          }
	      }
	      scan.close();
	}
	
	public void delete() {
		System.out.println("Enter path of directory:");
		Scanner scan = new Scanner(System.in);  
		String directory = scan.nextLine();
		
		File directoryPath = new File(directory);

	    System.out.println("Enter file name to be deleted with extension:");
	    String fileName = scan.nextLine();
	    
	    File file = new File(directoryPath,fileName);
	    
	    if(file.delete()) 
       { 
           System.out.println("File deleted successfully"); 
       } 
       else
       { 
           System.out.println("Failed to delete the file,Not found"); 
       } 
	   scan.close();
	}
	public void search() {
		System.out.println("Enter path of directory:");
		Scanner scan = new Scanner(System.in);  
		String directory = scan.nextLine();
		
		File directoryPath = new File(directory);

	    System.out.println("Enter the file name to be searched:");
	    String fileName = scan.next();
	    
	    FilenameFilter filter = new FilenameFilter() {
	         public boolean accept (File directoryPath, String name) { 
	            return name.startsWith(fileName);
	         } 
	      };
	      String[] str = directoryPath.list(filter);
	      if (str == null) {
	         System.out.println("Either dir does not exist or is not a directory"); 
	      } else { 
	         for (int i = 0; i< str.length; i++) {
	            String filename = str[i];
	            System.out.println(filename + " is found ");
	         } 
	      }
	     scan.close();
	}
}
