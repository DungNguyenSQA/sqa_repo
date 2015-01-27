package classExercise;

/*
 * 	Create an interface cellPhone;
 *	Declare properties int startBatteryLife = 500.
 * 	Declare the methods playGame(), playMovie(), getName()
 */
public interface ItrCellPhone {
	int START_BATTERY_LIFE = 500;
	
	int playGame();
	int playMovie();
	String getName();
}
