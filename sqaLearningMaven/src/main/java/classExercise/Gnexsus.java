package classExercise;

public class Gnexsus implements cellPhone{
	
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

	public int playGame(){
		return 40;
	}
	public int playMovie(){
		return 20;
	}
	
	public void entertain(){
		//Movie
		int varBatterylifeMovie = startBatteryLife;
		int numMovie = 0;
		do {
			varBatterylifeMovie -= playMovie();
			numMovie++;
		} while (varBatterylifeMovie > 250);
		System.out.println("Num movie played for gnexus : "+numMovie+", Battery left : "+varBatterylifeMovie);
		
		//Game
		
		int varBatterylifeGame = startBatteryLife;
		int numGame = 0;
		do {
			varBatterylifeGame -= playGame();
			numGame++;
		} while (varBatterylifeGame > 50);
		System.out.println("Num Games played for gnexus : "+numGame+", Battery left : "+varBatterylifeGame);
	}

}
