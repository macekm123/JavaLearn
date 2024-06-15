package inheritanceTut;

public abstract class Bicycle {
	
	private int gear;
	protected int speed;
	
	public Bicycle (int startSpeed, int startGear) {
		gear = startGear;
		speed = startSpeed;
	}
	
	public void setGear (int newValue) {
		gear = newValue;
	}
	
	public abstract void applyBrake(int decrement);
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public int getGear() {
		return gear;
	}

}
