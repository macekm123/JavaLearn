package inheritanceTut;

class DownhillBike extends MountainBike {
	
	private int wheelSize;

	public DownhillBike(int wheelSize, int startHeight, int startSpeed, int startGear) {
		super(startHeight,startSpeed,startGear);
		this.wheelSize = wheelSize;
	}
	
	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

}
 