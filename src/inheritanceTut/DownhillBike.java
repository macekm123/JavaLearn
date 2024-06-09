package inheritanceTut;

class DownhillBike extends MountainBike {
	
	int wheelSize;
	
	public DownhillBike(int wheelSize, int startHeight, int startSpeed, int startGear) {
		super(startHeight,startSpeed,startGear);
		this.wheelSize = wheelSize;
	}
	
	public void changeWheelSize(int newSize) {
		this.wheelSize = newSize;
	}

}
