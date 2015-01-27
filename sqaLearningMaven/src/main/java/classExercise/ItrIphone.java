package classExercise;

/*
 * Class should implement int playGame, int playMovie and String getName() 
 * Iphone PlayGame takes the 50units of  battery life every time 
 * a game is played and return the remaining battery life and movie 
 * takes 30 units of battery life every time a movie is played and 
 * returns remaining battery life. deduct 50 from battery life 
 * everytime playGame is called. deduct 30 from battery life 
 * everytime playMovie is called. getName methods returns the name 
 * of the device (iphone, nexus)
 */
public class ItrIphone implements ItrCellPhone{
	
	int remainingBatteryLife = ItrCellPhone.START_BATTERY_LIFE;
	
	public int playGame(){
		remainingBatteryLife -= 50;
		return remainingBatteryLife;
	}
	
	public int playMovie(){
		remainingBatteryLife -= 30;
		return remainingBatteryLife;
	}
	
	public String getName(){
		return "Iphone";
	}
}
