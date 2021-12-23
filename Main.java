import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String  custName = scanner.nextLine();
		System.out.println("Enter type of room:");
		String typeOfRoom = scanner.nextLine();
		System.out.println("Enter number of extra members:");
		int noOfExtraPerson = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter number of days of stay:");
		int noOfDaysOfStay = scanner.nextInt();
		
		RoomDetails cust1 = new RoomDetails(custName,typeOfRoom,noOfExtraPerson,noOfDaysOfStay);
		
		//RoomDetails cust1 = new RoomDetails("Ron Wisley","standard",-1,7);
		//RoomDetails cust2 = new RoomDetails("Harry","DELUX",2,20);
		System.out.println("Customer Details:");
		if (cust1.validateNoOfDaysOfStay()) {
			
			if(cust1.validateTypeOfRoom()) {
				
				if(cust1.validateNoOfExtraPerson()) {
					System.out.println("BillId: "+cust1.getBillId());
					System.out.println("Customer Name: "+cust1.getCustomerName());
					System.out.println("No. of Days of Stay: "+cust1.getNoOfDaysOfStay());
					System.out.println("Total Bill: "+cust1.calculateBill());
				}
				else {
					System.out.println("No of Extrea Person exceeds 2");
				}
			}
			else {
				System.out.println("Please enter valid room type");
			}	
		}
		else {
			System.out.println("please enter valid number of days of stay");
		}
		
		/*
		
		System.out.println("Customer 2:");
		
		if (cust2.validateNoOfDaysOfStay()) {
			
			if(cust2.validateTypeOfRoom()) {
				
				if(cust2.validateNoOfExtraPerson()) {
					System.out.println("BillId: "+cust2.getBillId());
					System.out.println("Customer Name: "+cust2.getCustomerName());
					System.out.println("No. of Days of Stay: "+cust2.getNoOfDaysOfStay());
					System.out.println("Total Bill: "+cust2.calculateBill());
				}
				else {
					System.out.println("No of Extrea Person exceeds 2");
				}
			}
			else {
				System.out.println("Please enter valid room type");
			}	
		}
		else {
			System.out.println("please enter valid number of days of stay");
		}
		*/
	}

}
