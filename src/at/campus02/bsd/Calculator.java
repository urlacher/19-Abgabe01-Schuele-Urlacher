package at.campus02.bsd;

/**
 * <2019.03.28 - Aufgabe 01> 
 * Interface Calculator
 * 
 * @author: <Thomas Urlacher, Denis Schuele> 
 * Last Change: <2019.04.03>
 */

public interface Calculator {

	int getMaximum();

	int getMinimum();
	
	void addValue(int value);
	
	int sum();
}
