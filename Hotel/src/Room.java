
public class Room {
	
	int roomNumber;
	String roomType;
	int floorNumber;
	boolean isOccupied = false;
	boolean needsCleaning = false;
//	occupant = client
	int avgPrice = 250;
	
	
	
	
	
	public void reserve(String roomType, int floorNumber, int roomNumber, boolean isOccupied, boolean needsCleaning, int avgPrice) {
		isOccupied = true;
		
		//assign client later
	}
	
	public void checkout() {
		//remove client from room
		isOccupied = false;
		needsCleaning = true;
		System.out.println("outsanding balance: " + avgPrice);
	}

}
