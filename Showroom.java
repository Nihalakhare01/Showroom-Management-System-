import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;   
import java.io.IOException;


 class Showroom1 
{
	String showname;
	String showadd;
	int totalemploy;
	int carsinstock=0;
	String managname;
	
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

	public void showroomdetails() {
        try {
            FileWriter writer = new FileWriter("showroomdetails.txt", true);
            writer.write("Showroom Name: " + showname + "\n");
            writer.write("Showroom Address: " + showadd + "\n");
            writer.write("Manager Name: " + managname + "\n");
            writer.write("Total Employees: " + totalemploy + "\n");
            writer.write("Cars In Stock: " + carsinstock + "\n\n");
            writer.close();
            System.out.println("Showroom details saved to file successfully.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving showroom details to file.\n");
            e.printStackTrace();
        }
    }

	public void readshowroom() {
        try {
			int i = 0;
            File file = new File("showroomdetails.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
					if (i == 5) {
						System.out.println();
						i=0;
					}
                System.out.println(line);
				i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: showroomdetails.txt");
            e.printStackTrace();
        }
    }

	public void clearshowroom() {
        try {
            FileWriter writer = new FileWriter("showroomdetails.txt");
            writer.write(""); // Write an empty string to truncate the file
            writer.close();
            System.out.println("Showroom details cleared successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while clearing showroom details in file.");
            e.printStackTrace();
        }
    }

	public void printshowbyname(String showroomName) {
        try {
			int i=0;
            File file = new File("showroomdetails.txt");
            Scanner scanner = new Scanner(file);
            boolean found = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("Showroom Name: "+showroomName)) {
                    found = true;
					 System.out.println(line);
						while (scanner.hasNextLine()) {
							String line1 = scanner.nextLine();
								if (i == 4) {
									System.out.println();
									break;
								}
							System.out.println(line1);
							i++;
						}
                }
            }
            scanner.close();
            if (!found) {
                System.out.println("No showroom details found with the given name: " + showroomName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: showroomdetails.txt");
            e.printStackTrace();
        }
    }
}
 class Employee extends Showroom1  
{
	String empname;
	String empid;
	String empdepart;
	int empage;
	String showname1;
		
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

	public void employeedetails() {
        try {
            FileWriter writer = new FileWriter("employeedetails.txt", true);
			writer.write("Employee Name: " + empname + "\n");
			writer.write("Employee ID: " + empid + "\n");
            writer.write("Employee Age: " + empage + "\n");
            writer.write("Employee Department: " + empdepart + "\n");
            writer.write("Showroom Name: " + showname1 + "\n\n");
            writer.close();
            System.out.println("Employee details saved to file successfully.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving employee details to file.\n");
            e.printStackTrace();
        }
    }

	public void reademployee() {
        try {
			int i=0;
            File file = new File("employeedetails.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
				if (i == 5) {
					System.out.println();
					i=0;
				}
                System.out.println(line);
				i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: employeedetails.txt");
            e.printStackTrace();
        }
    }

	public void clearemployee() {
        try {
            FileWriter writer = new FileWriter("employeedetails.txt");
            writer.write(""); // Write an empty string to truncate the file
            writer.close();
            System.out.println("Employee details cleared successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while clearing employee details in file.");
            e.printStackTrace();
        }
    }

	public void printempbyname(String employeeName) {
        try {
			int i=0;
            File file = new File("employeedetails.txt");
            Scanner scanner = new Scanner(file);
            boolean found = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("Employee Name: "+employeeName)) {
                    found = true;
					 System.out.println(line);
						while (scanner.hasNextLine()) {
							String line1 = scanner.nextLine();
								if (i == 4) {
									System.out.println();
									break;
								}
							System.out.println(line1);
							i++;
						}
                }
            }
            scanner.close();
            if (!found) {
                System.out.println("No employee details found with the given name: " + employeeName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: employeedetails.txt");
            e.printStackTrace();
        }
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

	public void cardetails() {
        try {
            FileWriter writer = new FileWriter("cardetails.txt", true);
            writer.write("Car Name: " + carname + "\n");
            writer.write("Car Color: " + carcolor + "\n");
            writer.write("Fuel Type: " + fueltype + "\n");
            writer.write("Car Type: " + cartype + "\n");
            writer.write("Car Transmission: " + cartrans + "\n");
            writer.write("Car Price: " + carprice + "\n\n");
            writer.close();
            System.out.println("Car details saved to file successfully.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving car details to file.\n");
            e.printStackTrace();
        }
    }

	public void readcars() {
        try {
			int i=0;
            File file = new File("cardetails.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
				if (i == 5) {
					System.out.println();
					i=0;
				}
                System.out.println(line);
				i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: cardetails.txt");
            e.printStackTrace();
        }
    }

	public void clearcar() {
        try {
            FileWriter writer = new FileWriter("cardetails.txt");
            writer.write(""); // Write an empty string to truncate the file
            writer.close();
            System.out.println("Car details cleared successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while clearing car details in file.");
            e.printStackTrace();
        }
    }

	public void printcarbyname(String carname) {
        try {
			int i=0;
            File file = new File("cardetails.txt");
            Scanner scanner = new Scanner(file);
            boolean found = false;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("Car Name: "+carname)) {
                    found = true;
					 System.out.println(line);
						while (scanner.hasNextLine()) {
							String line1 = scanner.nextLine();
								if (i == 5) {
									System.out.println();
									break;
								}
							System.out.println(line1);
							i++;
						}
                }
            }
            scanner.close();
            if (!found) {
                System.out.println("No car details found with the given name: " + carname);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: cardetails.txt");
            e.printStackTrace();
        }
    }
}

class exit extends Showroom1 
{
	 void exit1()
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
		System.out.println();			
		System.out.println("4].GET SHOWROOM\t\t\t 5].GET EMPLOYEE\t\t\t 6].GET CARS\n\n");
		System.out.println();
		System.out.println("7].DELETE ALL SHOWROOM DETAILS\t\t\t 8].DELETE ALL EMPLOYEE DETAILS\t\t\t 9].DELETE ALL CARS DETAILS\n\n");
		System.out.println();
		System.out.println("10].SEARCH BY SHOWROOM NAME\t\t\t 11].SEARCH BY EMPLOYEE NAME\t\t\t 12].SEARCH BY CARS NAME\n\n");
		System.out.println();
		System.out.println("============ *** ENTER 0 TO EXIT *** ===========\n\n");
	}

	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		
		Showroom1 [] showroom = new Showroom1 [100];
		Showroom1 show1 = new Showroom1();
		Employee[] emp = new Employee[100];
		Employee employee1 = new Employee();
		Cars[] cars = new Cars[100];
		Cars car1 = new Cars();
		exit ex = new exit();
		int show_count = 0;
		int emp_count = 0;
		int cars_count = 0;
		int choice = 100;

		while(choice!=0)
		{
			menu();
			choice = sc.nextInt();
				
			 while(choice!=0 && choice!=21)
			 {
				switch (choice)
				{	
					case 1:
						showroom[show_count] = new Showroom1();
						showroom[show_count].setdetails();
						showroom[show_count].showroomdetails();
						show_count++;
						System.out.println();
						System.out.println("1].ADD NEW SHOWROOM ");						
						System.out.println("21].GO TO MAIN MENU");
						choice=sc.nextInt();
						break;
						
					case 2:
						emp[emp_count] = new Employee();
						emp[emp_count].setdetails();
						emp[emp_count].employeedetails();
						emp_count++;
						System.out.println();
						System.out.println("1].ADD NEW EMPLOYEE ");						
						System.out.println("21].GO TO MAIN MENU");
						choice=sc.nextInt();
						break;
					
					case 3:
						cars[cars_count] = new Cars();
						cars[cars_count].setdetails();
						cars[cars_count].cardetails();
						cars_count++;
						System.out.println();
						System.out.println("1].ADD NEW CARS ");						
						System.out.println("21].GO TO MAIN MENU");
						choice=sc.nextInt();
						break;

					case 4:
						
							show1.readshowroom();
							System.out.println();
							System.out.println();	
						
						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;
					
					
					case 5:
							employee1.reademployee();
							System.out.println();
							System.out.println();

						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;
					
					case 6:
							car1.readcars();
							System.out.println();
							System.out.println();	

						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;

					case 7:
						show1.clearshowroom();
						System.out.println();
						System.out.println();

						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;

					case 8:
						employee1.clearemployee();
						System.out.println();
						System.out.println();

						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;	

					case 9:
						car1.clearcar();
						System.out.println();
						System.out.println();

						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();
						break;	

					case 10:
                        System.out.print("Enter showroom name: ");
                        String showroomName = sc.next();
						System.out.println();
                        show1.printshowbyname(showroomName);

						System.out.println();
						System.out.println();

						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();	
                   	    break;	
					
					case 11:
						System.out.print("Enter Employee name: ");
					   	String employeenm = sc.next();
					   	System.out.println();
					   	employee1.printempbyname(employeenm);
   
					   	System.out.println();
					   	System.out.println();
   
					   	System.out.println("21].GO BACK TO MAIN MENU");
					   	System.out.println("0].EXIT");
					   	choice=sc.nextInt();	
						break;	

					case 12:
						System.out.print("Enter Car name: ");
					   	String carnm = sc.next();
					   	System.out.println();
					   	car1.printcarbyname(carnm);
   
					   	System.out.println();
					   	System.out.println();
   
					   	System.out.println("21].GO BACK TO MAIN MENU");
					   	System.out.println("0].EXIT");
					   	choice=sc.nextInt();	
						break;		

					default:
						System.out.println("ENTER A VALID CHOICE: \n");
						System.out.println("21].GO BACK TO MAIN MENU");
						System.out.println("0].EXIT");
						choice=sc.nextInt();	
					break;
				}
				
			}

			if (choice == 0) {
				ex.exit1();
				break;
			}
		}
	
	}
}
