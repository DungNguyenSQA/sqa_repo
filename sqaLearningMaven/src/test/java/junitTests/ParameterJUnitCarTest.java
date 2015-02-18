package junitTests;

import inheritence.Car;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParameterJUnitCarTest {
	
	private int engineCapInput;
	private int engineCapOutput;		

	//This constructor is required to have same number of parameters as your input set
	//defined in @Parameters method. every attribute of the array is mapped to parameter 
	//of this constructor.
	public ParameterJUnitCarTest(int oper1, int oper2){
		this.engineCapInput = oper1;
		this.engineCapOutput = oper2;		
	}

	@Test
	public void engineCapTest(){
		Car car = new Car();
		car.setEngineCap(engineCapInput);
		Assert.assertEquals(engineCapOutput, car.getEngineCap());
	}	
			
	@Parameters(name= "counter is - {index}, inputs are {0} and {1}")
	public static Collection<Integer[]> fjdakslfd(){
		Integer[][] dataArr = new Integer[][]{{2,2},{3,3},{74,74},{54,54},{44,34},{24,24},{14,14}};		
		List<Integer[]> intArrList = Arrays.asList(dataArr);	
		return intArrList;
	}
}
