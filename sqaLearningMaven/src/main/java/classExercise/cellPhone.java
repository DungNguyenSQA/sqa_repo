package classExercise;

public interface cellPhone {

//	Create an interface cellPhone;
//	Declare properties int startBatteryLife = 500.
//
//	Declare the methods playGame(), playMovie()
//	Create 2 classes(iphone, Gnexus) which implements this interface.
//	Class should implement playGame and playMovie. 
//	Iphone PlayGame takes the 50units of  battery life every time  a game is played and 
//	movie takes 30 units of battery life every time a movie is played. 
//	//deduct 50 from battery life everytime playGame is called. 
//	//deduct 30 from battery life everytime playMovie is called.
//	Gnexus PlayGame takes the 40units of  battery life every time  a game
//	is played and movie takes 20 units of battery life every time a movie is played.
//	// same as above.
//	Define a method public void entertain() in the class, that plays the movie till 
//	battery is 250 and then plays the games till battery is less or equal to 50.

	public static final int startBatteryLife = 500;
	
	public abstract int playGame();
	public abstract int playMovie();
	
}
