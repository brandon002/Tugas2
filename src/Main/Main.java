package Main;
import Factory.PackageFactory;
import Package.Package;
import Singleton.db;

import java.util.Scanner;
import java.util.Vector; 

public class Main {
	Scanner scan = new Scanner(System.in);
	db db =null;
	PackageFactory Factory = null;
	Vector<Package> listPackage = db.getListPackage();
	public void menu() {
		System.out.println("Ikeru Co.");
		System.out.println("=========");
		System.out.println("1. Create Arrangement");
		System.out.println("2. View Arrangement Package");
		System.out.println("3. Exit");
	}
	
	public void menuSatu() {
		String Package = " ";
		
		do {
			System.out.print("Input arrangement type [Ikebana | Ikekabe] [Case Sensitive]: ");
			Package = scan.nextLine();
		}while(!Package.equals("Ikebana")&&!Package.equals("Ikekabe"));
		
		if(Package == "Ikebana") {
			String Package0 = " ";
			do {
				System.out.print("Input Package Name[Length Between 5 - 15]: ");
				Package0 = scan.nextLine();
			}while(Package0.length()<5 || Package0.length()>15);
			
			int qty = 0; 
			do {
				System.out.print("Input Component Amount [1-" + listPackage.size() + ": " );
				qty = scan.nextInt(); scan.nextLine();
			}while(qty<1 || qty>listPackage.size());
		}
		else {
			
		}
	}
	
	public Main() {
		int choice = 0;
		
		do {
			menu();
			choice = scan.nextInt(); scan.nextLine();
		}while(choice!= 1 && choice != 2 && choice !=3);
		
		switch(choice) {
		case 1: { menuSatu();break;
		}
		case 2: {break;
		}
		case 3: {System.out.println("We hope to see you again!"); break;}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
