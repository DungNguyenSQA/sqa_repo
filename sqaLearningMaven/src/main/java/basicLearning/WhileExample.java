package basicLearning;

public class WhileExample {

	public static void main(String[] args) {
		//for (int i = 0; i< 10; i++){
		int i = 0;
		while(i < 10){//evaluates to a boolean condition true/false
			System.out.println("value of i is : "+i);
			i++;
		}
		
		while(true){
			if(i%2==0){
				break;
			}
		}
		//while(!fileExists){
			//do some task
			//if(not equal true)
			//break;
			//if time is more than 10 mins
			//break;
		//}
	}
}
