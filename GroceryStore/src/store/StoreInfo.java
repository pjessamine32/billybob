package store;

//import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.InputMismatchException;

public class StoreInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating arrays
				mainstore mybusiness[] = new mainstore[3];
				for (int i=0; i<3; i++){
					mybusiness [i] = new mainstore();
				}
				//mainstore mybusiness[] = new mainstore[3];
				mybusiness [0] = new Bakery();//mainstore();
				mybusiness [1] = new Produce();
				mybusiness [2] = new Meats();
				
				
				
				
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a new manager to input?");
			String newman = input.next();
				if (newman.equalsIgnoreCase("yes") || newman.equalsIgnoreCase("y"))
				{
					System.out.println("Enter store name");
						mybusiness[2].store = input.next();
					System.out.println("Enter new manager name");
						mybusiness[2].manager = input.next();
					System.out.println("Enter department");
						mybusiness[2].department = input.next();
					System.out.println("Enter hourly salary");
						try 
						{
							mybusiness[2].salary = input.nextInt();
						}
						catch (InputMismatchException inputMismatchException)
						{
							
						}
					System.out.println("Enter current inventory amount");
					mybusiness[2].inventory = input.nextInt();//.setinventory(v);//
				}
				
				for (int i=0; i<3; i++){
					String d = mybusiness[i].getstore();
					String n = mybusiness[i].getdepartment();
					String c = mybusiness[i].getmanager();
					int s = mybusiness[i].getsalary();
					int v = mybusiness[i].getinventory();
					
					System.out.println(d + " " + n + " " + c + " " + s + " " + v);
					//System.out.println(c +  " " + d + " " + v);
				}
				
		
		
		//String n = JOptionPane.showInputDialog("New manager?/nClick OK to enter info/nClick cancel for no");
		//String m = JOptionPane.showInputDialog("Enter new manager name");
		//String d = JOptionPane.showInputDialog("Enter department");
		//String s = JOptionPane.showInputDialog("Enter hourly salary");
		//String i = JOptionPane.showInputDialog("Enter current inventory amount");
		
		
		//mainstore mybusiness = new mainstore();  //constructor for calling class
		//String s = mybusiness.getstore();
		//String n = mybusiness.getdepartment();
		//String c = mybusiness.getmanager();
		//int w = mybusiness.getsalary();
		//int v = mybusiness.getinventory();
		
		//System.out.println(s + " " + n);
		//System.out.println(c + " " + w + " " + l);
		
		//mybusiness.setsalary();  //setting the number of wins to 5
		//mybusiness.setinventory();
		
		//w = mybusiness.getsalary();  //create new get to retrieve 5 & 2
		//v = mybusiness.getinventory();
		
		//System.out.println(s + " " + n);
		//System.out.println(c + " " + w + " " + v);
		
		
		
		
		

	}

}

