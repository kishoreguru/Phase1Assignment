package Client;

import java.io.IOException;
import java.util.Scanner;

import Service.FileManipulation;

public class LockedMePrototype {
	
	public static void main(String[] args) throws IOException {
		System.out.println("				Welcome LOCKEDME.COM");
		System.out.println("--------------------------------------------------------------------");
		Prototype pr = new Prototype();
		pr.options();
	}
}

class Prototype extends FileManipulation{

	void options() throws IOException {
		System.out.println("		Choose an option                     ");
		System.out.println("			1. Display Files In Sorted Manner");
		System.out.println("			2. Execute File Operations");
		System.out.println("			3. Exit");
		
		Scanner scan = new Scanner(System.in);
		int var = scan.nextInt();
		
		switch(var) {
		
		case 1:
			display();
			break;
		case 2:
			System.out.println("		Choose an option                     ");
			System.out.println("			1. Create/Add A New File In Directory");
			System.out.println("			2. Delete File");
			System.out.println("			3. Search File");
			System.out.println("			4. Go back To Main Menu");
			int var1 = new java.util.Scanner(System.in).nextInt();
			
			switch(var1) {
			
			case 1:
				create();
				break;
			case 2:
				delete();
				break;
			case 3:
				search();
				break;
			case 4:
				options();
				break;
			default:
				System.out.println("Invalid Option! ");
				
			}
				break;
			case 3:
				System.exit(0);

			default:
				System.out.println("Invalid Option! ");
			}
		scan.close();
	}
}

