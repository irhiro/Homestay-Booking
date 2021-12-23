
public class RoomDetails implements RoomBillComponent {
	
	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	static int counter=100;
	
	RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay){
		RoomDetails.counter++;
		this.setCustomerName(customerName);
		this.setTypeOfRoom(typeOfRoom);
		this.setNoOfExtraPersons(noOfExtraPersons);
		this.setNoOfDaysOfStay(noOfDaysOfStay);
		this.setBillId(counter);
		
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}
	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}
	public void setNoOfDaysOfStay(int noOfDaysOfStay) {
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}
	public void setNoOfExtraPersons(int noOfExtraPersons) {
		this.noOfExtraPersons = noOfExtraPersons;
	}
	
	public boolean validateNoOfExtraPerson() {
		if (this.getNoOfExtraPersons() >= 0 && this.getNoOfExtraPersons() <= 2) {
			//System.out.println("Number of extra persons are "+this.getNoOfExtraPersons());
			return true;
		}
		else {
			//System.out.println("Number of extra persons exceeds 2");
			return false;
		}
	}
	
	public boolean validateTypeOfRoom() {
		
		if (this.getTypeOfRoom().equalsIgnoreCase("Standard") || 
				this.getTypeOfRoom().equalsIgnoreCase("delux") || 
				this.getTypeOfRoom().equalsIgnoreCase("cottage")) {
			//System.out.println("Type of room is"+this.getTypeOfRoom());
			return true;
		}
		else {
			//System.out.println("Please enter correct room type");
			return false;
		}
	}
	
	public boolean validateNoOfDaysOfStay() {
		if (this.getNoOfDaysOfStay()>0 && this.getNoOfDaysOfStay()<16) {
			return true;
		}
		return false;
	}
	
	@Override
	public float calculateBill() {
		float base_room_fare;
		float finalBill = 0;
		if (validateTypeOfRoom() == true) {
			if (this.getTypeOfRoom().equalsIgnoreCase("standard")) {
				base_room_fare = 2500;
			}
			else if (this.getTypeOfRoom().equalsIgnoreCase("delux")) {
				base_room_fare = 3500;
			}
			else {
				base_room_fare = 5500;
			}
			if (validateNoOfDaysOfStay() == true) {
				if (validateNoOfExtraPerson() == true) {
					float totalBill = (float) ((this.getNoOfDaysOfStay()*base_room_fare)+(this.getNoOfDaysOfStay()*FOOD_CHARGE)+(EXTRA_PERSON_CHARGE*this.noOfExtraPersons));
					finalBill = totalBill + TAX*totalBill;
					
				}
				
			}
			
		}
		return finalBill;
		
	}
				
}
