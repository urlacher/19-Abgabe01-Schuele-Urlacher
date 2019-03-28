package at.campus02.bsd;

/**
 * <2019.03.27 - Aufgabe 01> 
 * Versioning
 * 
 * @author: <Thomas Urlacher, Denis Schülle> 
 * Last Change: <2019.03.28>
 */

public class Main {
	

    public static void main(String[] args){
    	
    	// Declared Calculator
    	Calculator calculator = new CalculatorImpl();
    	
    	//Adding Values to the list
    	calculator.addValue(2);
    	calculator.addValue(9);
    	calculator.addValue(4);
    	calculator.addValue(90);
    	
    	//Testing Methods
    	System.out.println("Max: "+ calculator.getMaximum());
    	System.out.println("Min: "+ calculator.getMinimum());
    	System.out.println("Sum: "+ calculator.sum());
    }
    
}
