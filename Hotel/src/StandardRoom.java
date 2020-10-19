
public class StandardRoom extends Room {
	int numberOfBeds;
	int partySize;
	String roomType = "single";
	

	public void reserve(int partySize, int numberOfBeds) {
		if(partySize > (numberOfBeds *2)) {
			System.out.println("room unavailable!");
		} else {
//			reserve(1, 1);
		}
	}
}
