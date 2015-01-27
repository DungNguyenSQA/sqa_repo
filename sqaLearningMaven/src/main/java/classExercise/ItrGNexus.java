package classExercise;

public class ItrGNexus implements ItrCellPhone {
	int remainingBatteryLife = ItrCellPhone.START_BATTERY_LIFE;
	
	public int playGame() {
		remainingBatteryLife -= 40;
		return remainingBatteryLife;
	}

	public int playMovie() {
		remainingBatteryLife -= 20;
		return remainingBatteryLife;
	}
	
	public String getName(){
		return "GNexus";
	}
}
