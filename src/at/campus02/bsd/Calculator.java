package at.campus02.bsd;

/**
 * <2019.03.28 - Aufgabe 01> 
 * Interface Calculator
 * 
 * @author: <Thomas Urlacher, Denis Schülle> 
 * Last Change: <2019.03.28>
 */

public interface Calculator {

	int getMaximum();

	int getMinimum();
	
	void addValue(int value);
	
	int sum();
}
