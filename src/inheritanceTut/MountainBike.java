package inheritanceTut;

class MountainBike extends Bicycle {
	
	public int seatHeight;
	
	public MountainBike (int startHeight, int startSpeed, int startGear) {
		super(startSpeed, startGear);
		this.seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public void applyBrake(int decrement) {
		
		this.speed -= decrement;
		
	}

}
