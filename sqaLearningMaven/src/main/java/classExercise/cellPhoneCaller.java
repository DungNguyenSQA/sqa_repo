package classExercise;

public class cellPhoneCaller {

	public static void main(String[] args) {

//		Create an interface cellPhone;
//		Declare properties int startBatteryLife = 500.
	//
//		Declare the methods playGame(), playMovie()
//		Create 2 classes(iphone, Gnexus) which implements this interface.
//		Class should implement playGame and playMovie. 
//		Iphone PlayGame takes the 50units of  battery life every time  a game is played and 
//		movie takes 30 units of battery life every time a movie is played. 
//		//deduct 50 from battery life everytime playGame is called. 
//		//deduct 30 from battery life everytime playMovie is called.
//		Gnexus PlayGame takes the 40units of  battery life every time  a game
//		is played and movie takes 20 units of battery life every time a movie is played.
//		// same as above.
//		Define a method public void entertain() in the class, that plays the movie till 
//		battery is 250 and then plays the games till battery is less or equal to 50.

		iPhone ip = new iPhone();
		ip.entertain();
//		ip.entertain("iPhone");

		Gnexsus gnex = new Gnexsus();
		gnex.entertain();
//		gnex.entertain("Gnexus");
	}

//	public static void entertain(String cellPhoneName){
//		//Movie
//		int varBatterylifeMovie = cellPhone.startBatteryLife;
//		int numMovie = 0;
//		do {
//			varBatterylifeMovie -= cellPhoneName.playMovie();
//			numMovie++;
//		} while (varBatterylifeMovie > 250);
//		System.out.println("Num movie played for gnexus : "+numMovie+", Battery left : "+varBatterylifeMovie);
//		
//		//Game
//		
//		int varBatterylifeGame = cellPhone.startBatteryLife;
//		int numGame = 0;
//		do {
//			varBatterylifeGame -= cellPhoneName.playGame();
//			numGame++;
//		} while (varBatterylifeGame > 50);
//		System.out.println("Num Games played for gnexus : "+numGame+", Battery left : "+varBatterylifeGame);
//	}

}
