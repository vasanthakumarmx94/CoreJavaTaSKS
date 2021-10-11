package Lab.unit3;

public class Roomclass {
	
	int room_No;
	String room_Type;
	String roomarea;
	boolean ACmachine;
	public Roomclass() {
		this.room_No =1;
		this.room_Type ="1BHk"; 
		this.roomarea ="mysore";
		this.ACmachine = true;
		
	}
	public Roomclass(int room_No, String room_Type, String roomarea, boolean ACmachine) {
		
		this.room_No = room_No;
		this.room_Type = room_Type;
		this.roomarea = roomarea;
		this.ACmachine = ACmachine;
	}
	void setData(int rNo, String rType, String rarea, boolean ACm) {
		room_No=rNo;
		room_Type=rType;
		roomarea=rarea;
		ACmachine=ACm;
		
	}
	public void displayData() {
		System.out.println("Room no:"+room_No+"\nRoom Type:"+room_Type+"");
		System.out.println("RoomArea:"+roomarea+"\nACmachine:"+ACmachine+" \n");
		
		
	}

}
