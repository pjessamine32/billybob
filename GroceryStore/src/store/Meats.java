package store;

public class Meats extends mainstore {
	protected String store = "unknown";
	protected String department = "unknown";
	protected String manager;
	protected int salary;
	protected int inventory;

	public Meats(){  //constructor
		store = "unknown";
		department = "unknown";
		manager = "nameless";
		salary = 0;
		inventory= 0;  //won't use w5 & i2 in this class until adding get method.  uses 0,0 from superteam class.
		
	}
	//@Override //> tells to override prior instance and use this class variable
	public String getstore(){
		return (store);  //get method
	}
	
	public String getdepartment(){
		return (department);  //get method
	}

	public String getmanager(){
		return (manager);  //get method
	}
	
	public int getsalary(){
		return (salary);  //get method
	}
	
	public int getinventory(){
		return (inventory);  //get method
	}
	
	
	}