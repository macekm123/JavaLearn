package inheritanceTut;

class InheritanceDemo {
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20, 10, 1);
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Seat height is: " + mountainBike.seatHeight);
		System.out.println("Bike speed is: " + mountainBike.speed);
		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying brake is: " + mountainBike.speed);

		DownhillBike downhillBike = new DownhillBike(16, 21, 11, 2);
		System.out.println("Gear is: " + downhillBike.getGear());
		System.out.println("Seat height is: " + downhillBike.seatHeight);
		System.out.println("Bike speed is: " + downhillBike.speed);
		System.out.println("Wheel size is: " + downhillBike.getWheelSize());
		downhillBike.setWheelSize(20);
		System.out.println("Bike wheel size after changing wheel is: " + downhillBike.getWheelSize());
		
	}

}