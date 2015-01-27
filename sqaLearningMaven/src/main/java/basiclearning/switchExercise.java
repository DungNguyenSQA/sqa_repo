package basiclearning;

public class switchExercise {

	public static void main(String[] args) {
		int num = 131;
		
        switch(num){        
        case 1 : 
            System.out.println("Jannuary");
            break;
        case 2 : 
            System.out.println("Feb");
            break;
        case 3 : 
            System.out.println("Mar");
            break;
        case 4 : 
            System.out.println("April");
            break;
        case 5 : 
            System.out.println("May");
            break;
        case 6 : 
            System.out.println("June");
            break;
        case 7 : 
            System.out.println("July");
            break;
        case 8 : 
            System.out.println("Aug");
            break;
        case 9 : 
            System.out.println("Sep");
            break;
        case 10 : 
            System.out.println("Oct");
            break;
        case 11 : 
            System.out.println("Nov");
            break;
        case 12 : 
            System.out.println("Dec");
            break;    
        default :
            System.out.println("Huh ?");
	}
        for (int i = 1; i<=100; i++) {
        	System.out.println("Number is : "+i);
        }	
        for (int i = 1; i<=100; i++) {
        	if ((i % 2) == 0) {
        	System.out.println("Number is : "+i);
        	}
        }
	}
}
