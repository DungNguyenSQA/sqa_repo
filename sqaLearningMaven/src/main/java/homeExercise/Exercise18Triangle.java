package homeExercise;

public class Exercise18Triangle extends Exercise18Shape{
	private float base;
	private float height;		
	
	public Exercise18Triangle(String name, float base, float height) {
		super(name);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		double area = (0.5) * getBase() * getHeight();
		return area;
	}		

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}		
}
