package classExercise;

/*
 * Define a method public void entertain() in the caller class, 
 * that plays the movie till battery is 250 and then plays the games till battery is less or equal to 50.
 */
public class ItrCellPhoneCaller {
	static int movieLimit = 250;
	static int gameLimit = 50;
	
	public static void main(String args[]){
		ItrCellPhone iphone = new ItrIphone();				
		ItrCellPhone nexus = new ItrGNexus();
		
		ItrCellPhone[] phoneArr = new ItrCellPhone[]{iphone,nexus};
		entertain(phoneArr);
	}
	
	public static void entertain(ItrCellPhone[] phoneArr){
		for(ItrCellPhone phone : phoneArr){
			int moviePlayed = 1;
			int gamePlayed = 1;
			
			while(phone.playMovie() >=250){
				System.out.println("Playing movie on :"+phone.getName()+" - "
						+(moviePlayed++)+" times");			
			}
			while(phone.playGame() >= 50){
				System.out.println("Playing game on :"+phone.getName()+" - "
						+(gamePlayed++)+" times");			
			}
		}				
	}
}
