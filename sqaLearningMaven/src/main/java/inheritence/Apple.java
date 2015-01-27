package inheritence;

public class Apple extends Fruit {  
	/*
	 * ERRORS IN THIS CLASS ARE ON PURPOSE FOR UNDERSTANDING
	 */
	 
	/* 
	 * a subclass can override all non-private, non-static and non-final methods of its superclass 
	 */  
	@Override  
	public String name() {  
		return "Apple";  
	}  

	@Override  
	protected void myProtectedMethod() {  
		System.out.println("This is for me and my subclasses only - ovverride !");  
	}  

	@Override  
	void defaultScope() {  
		System.out.println("I am in defult scope of 'Apple' class !");  
	}  

	/* 
	 * private methods of a superclass can not be overridden in subclass, this 
	 * method is identical to one in superclass, but this is not overridden, this 
	 * is purely a separate method from one in superclass 
	 */  
	private void myPrivateMethod() {  
		System.out.println("This is apples's own method and not a overriden one !");  
	}  

	public void iAmApple() {  
		System.out.println("Being apple is my personal attribute !");  
	}  

	/* 
	 * static methods of a superclass can not be overridden, as @Override 
	 * annotation can not be used here. This practice is called hiding the 
	 * superclass method instead 
	 */  
	public static void iAmStatic() {  
		System.out.println("I am static to Apple");  
	}  
	
	 /* we can not override a final method, this is the way to protect a 
	  * superclass method to be overridden in subclass  
	  */ 
	public final void iAmFinal(){  
	System.out.println("I am static to Fruit"); 
	}  
}  
