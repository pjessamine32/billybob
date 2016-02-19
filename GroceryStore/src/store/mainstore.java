package store;

public class mainstore {

	protected String store; //can be seen in other classes using methods
	protected String department;
	protected String manager;
	protected int salary;
	protected int inventory;
	
	public mainstore (){  //constructor
		//instances
		store = "unknown";
		department = "unknown";
		manager = "unknown";
		salary = 0;
		inventory = 0;
		
	}
	
	public mainstore(String winner, String dept, String m){  //constructor (always public) passing two strings
		 //instances
		store = winner;
		department = dept; //change name ^
		manager = m;  //change name ^
		salary = 0;
		inventory = 0;
	}
	
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
	
	public void getsalary(int s){
		salary = s;
		return;  //set method, no answers returned
	}
	
	public void setinventory(int v){
		inventory = v;
		return;  //set method, no answers returned
	}

}
	
