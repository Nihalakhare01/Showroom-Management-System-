import java.util.Scanner;


 class Showroom1 
{
	String showname;
	String showadd;
	int totalemploy;
	int carsinstock=0;
	String managname;

	public void getdetails()
	{
		System.out.println("showroom Name: "+ showname);
		System.out.println("Showroom Address: "+ showadd);
		System.out.println("Manager Name: "+ managname);
		System.out.println("Total Employees: "+ totalemploy);
		System.out.println("Cars In Stock: "+ carsinstock);
	}
	
	public void setdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("============ *** ENTER SHOWROOM DETAILS *** ===========\n\n");
		System.out.print("SHOWROOM NAME: ");
		showname=sc.nextLine();
		System.out.print("SHOW ADDRESS: ");		
		showadd=sc.nextLine();
		System.out.print("MANAGER NAME: ");
		managname=sc.nextLine();
		System.out.print("TOTAL EMPLOYEES: ");
		totalemploy=sc.nextInt();
		System.out.print("TOTAL CARS IN STOCK: ");
		carsinstock=sc.nextInt();
	}
}
 class Employee extends Showroom1  
{
	String empname;
	String empid;
	String empdepart;
	int empage;
	String showname1;
	
	
	public void getdetails()
	{
		System.out.println("ID: "+empid);
		System.out.println("Name: "+empname);
		System.out.println("Age: "+empage);
		System.out.println("Department: "+empdepart);
		System.out.println("Showroom Name: "+showname1);
	}

		
	public void setdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("============ *** ENTER EMPLOYEE DETAILS *** ===========\n\n");
		System.out.print("EMP ID: ");
		empid=sc.nextLine();
		System.out.print("EMP NAME: ");		
		empname=sc.nextLine();
		System.out.print("EMP DEPARTMENT: ");
		empdepart=sc.nextLine();
		System.out.print("SHOWROOM NAME: ");
		showname1=sc.nextLine();
		System.out.print("EMP AGE: ");
		empage=sc.nextInt();
	}
}
 class Cars extends Showroom1  
{
	String carname;
	String carcolor;
	String fueltype;
	String cartype;
	String cartrans;
	int carprice;

	public void getdetails()
	{
		
		System.out.println("Name: "+carname);
		System.out.println("Color: "+carcolor);
		System.out.println("Fuel Type: "+fueltype);
		System.out.println("Car Type: "+cartype);
		System.out.println("Car Transmission: "+cartrans);
		System.out.println("Car Price: "+carprice);
	}

	public void setdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("============ *** ENTER CAR DETAILS *** ===========\n\n");
		System.out.print("NAME: ");
		carname=sc.nextLine();
		System.out.print("COLOR: ");		
		carcolor=sc.nextLine();
		System.out.print("FUEL TYPE(PETROL/DIESEL/EV): ");
		fueltype=sc.nextLine();
		System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
		cartype=sc.nextLine();
		System.out.print("CAR TRANSMISSION(AUTOMATIC/MANUAL): ");
		cartrans=sc.nextLine();
		System.out.print("CAR PRICE(IN NUMBERS): ");
		carprice=sc.nextInt();
		carsinstock++;
	}
}

class exit extends Showroom1 
{
	static void exit1()
	{
		System.out.println("============ *** THANK YOU! *** ===========\n\n");
		System.out.println("============ *** VISIT AGAIN!! *** ========\n\n");
	}
}

 class Showroom
{
		
	static void menu()
	{
		System.out.println("============ *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ===========\n\n");
		System.out.println();
		System.out.println("============ *** ENTER YOUR CHOICE *** ===========\n\n");
		System.out.println();
		System.out.println("1].ADD SHOWROOM\t\t\t 2].ADD EMPLOYEE\t\t\t 3].ADD CARS\n\n");
		System.out.println();			System.out.println("4].GET SHOWROOM\t\t\t 5].GET EMPLOYEE\t\t\t 6].GET CARS\n\n");
		System.out.println();
		System.out.println("============ *** ENTER 0 TO EXIT *** ===========\n\n");
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		
		Showroom1 [] showroom = new Showroom1 [100];
		Employee[] emp = new Employee[100];
		Cars[] cars = new Cars[100];
		int show_count = 0;
		int emp_count = 0;
		int cars_count = 0;
		int choice = 100;
		while(choice!=0)
		{
			menu();
			choice = sc.nextInt();
				
			while(choice!=0 && choice!=9)
			{
				switch (choice)
				{
					case 1:
						showroom[show_count] = new Showroom1();
						showroom[show_count].setdetails();
						show_count++;
						System.out.println();
						System.out.println("1].ADD NEW SHOWROOM ");						
						System.out.println("9].GO TO MAIN MENU");
						choice=sc.nextInt();
						break;
						
					case 2:
						emp[emp_count] = new Employee();
						emp[emp_count].setdetails();
						emp_count++;
						System.out.println();
						System.out.println("1].ADD NEW EMPLOYEE ");						
						System.out.println("9].GO TO MAIN MENU");
						choice=sc.nextInt();
						break;
					
					case 3:
						cars[cars_count] = new Cars();
						cars[cars_count].setdetails();
						cars_count++;
						System.out.println();
						System.out.println("1].ADD NEW CARS ");						
						System.out.println("9].GO TO MAIN MENU");
						choice=sc.nextInt();
						break;

					case 4:
						for(int i=0; i<show_count; i++)
						{
							showroom[i].getdetails();
							System.out.println();
							System.out.println();	
						}
						System.out.println();
						System.out.println("9].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;
					
					
					case 5:
						for(int i=0; i<emp_count; i++)
						{
							emp[i].getdetails();
							System.out.println();
							System.out.println();	
						}
						System.out.println();
						System.out.println("9].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;
					
					case 6:
						for(int i=0; i<cars_count; i++)
						{
							cars[i].getdetails();
							System.out.println();
							System.out.println();	
						}
						System.out.println();
						System.out.println("9].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;

					default:
						System.out.println("ENTER A VALID CHOICE: ");
						break;
				}
			}
		}
	}
}
