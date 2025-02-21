package examples;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
	// Calculator calc = new Calculator();(without before each) or 
	Calculator calc;
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
			}
	
	@Test
	public void addTest() {
		
		// Perform the add function to get the actual result
		int result1 = calc.add(10, 20);
		int result2 = calc.add(15, 15);
		int result3 = calc.add(25, 5);
		
		//Add an assertion to verify against EXPECTED value
		assertAll(
				() -> assertEquals(30, result1),
		        () -> assertEquals(30, result2),
		        () -> assertEquals(30, result3)
		        );
		
	}
	
	@Test
	public void multiplyTest() {
		// Perform the multipication function.
		int resultM = calc.multiply(3, 6);
		
		//Add an assertion to verify against the exepected value
		assertEquals(18, resultM);
				
	}
	
	@ParameterizedTest
	@ValueSource(ints = {10, 20, 25, 100})
	public void paramSqrtTest(int num1) {
		//Perform the add function to get the actual result
		int result = calc.square(num1);
		
		//Add an assertion statement to verify against Expected result
		
		assertEquals(num1 * num1, result);
	}
	
	@ParameterizedTest
	@CsvSource({
		"10, 90", "50, 50", "80, 20"
	})
	public void paramAddTest(int num1, int num2) {
		// perform add function to get actual result
		int result1 = calc.add(num1, num2);
		
		assertEquals(100, result1);
		
	}	
	
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/input.csv", nullValues = {"N/A", "NA", "-"})
	public void AggregateTest(ArgumentsAccessor args) {
		System.out.println(args.getString(0));
		
		
	}	

}
