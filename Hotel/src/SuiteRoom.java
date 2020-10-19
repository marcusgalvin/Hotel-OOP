
public class SuiteRoom extends Room {
	String roomType = "suite";
	int numberOfRooms = 2;
	int numberOfBeds;
	boolean kitchen = true;
	boolean needsRestock = false;
	
	public void reserve(boolean needsRestock) {
		if(needsRestock == true) {
			System.out.println("please restock kitchen before reserving suite!");
		} else {
		}
	}
}
