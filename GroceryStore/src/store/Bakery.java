package store;



	public class Bakery extends mainstore{
		private String store = "unknown";
		private String department = "unknown";
		private String manager;
		private int salary;
		private int inventory;

		public Bakery(){  //constructor
			store = "Vann's ThriftyShop";
			department = "BakedFresh";
			manager = "Muffin Man Mike";
			salary = 3450;
			inventory = 5000;  //won't use w5 & i2 in this class until adding get method.  uses 0,0 from superteam class.
			
		}
		@Override //> tells to override prior instance and use this class variable
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


