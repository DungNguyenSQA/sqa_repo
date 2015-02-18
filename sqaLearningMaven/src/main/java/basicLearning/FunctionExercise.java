package basicLearning;

public class FunctionExercise {

	public static void main(String[] args) {
		check20(11);
		check20(9);
		check20(21);
		
		checkmonth(2);
		checkmonth(15);
		
		int varNum = FunctAdd(2,3);
		System.out.println("Add : "+varNum);
		varNum = FunctSub(3,2);
		System.out.println("Sub : "+varNum);
		varNum = FunctMul(2,3);
		System.out.println("Mul : "+varNum);
		float Num = FunctDiv(7,2);
		System.out.println("Div : "+Num);
		
		
		printTill(5);
		System.out.println("Calling method 2nd time : ");
		printTill(1);
		System.out.println("Calling method 3rd time : ");
		printTill(0);
		
	}
		
		
	public static void check20(int a){
		
		if (a > 10) {
			System.out.println(a + " is greater than 10");
		} else {
			System.out.println(a + " is smaller than 10");
		}
	

	}

	public static void checkmonth(int num) {
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
	}
		public static int FunctAdd(int a, int b){
			int varsum = a+b;
			return varsum;
		}
		
		public static int FunctSub(int a, int b){
			int varnum = a-b;
			return varnum;
		}

		public static int FunctMul(int a, int b){
			int varnum = a*b;
			return varnum;
		}
		
		public static float FunctDiv(float a, float b){
			float varnum = a/b;
			return varnum;
		}
		
		public static void printTill(int a){
			for (int i=1; i<=a; i++){
			System.out.println("Number is : "+i);
			}
		}
		
	// add 2 int & return sum
	// sub 2 int & return sub
}
