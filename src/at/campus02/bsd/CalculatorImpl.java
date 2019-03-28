package at.campus02.bsd;

/**
 * <2019.03.28 - Aufgabe 01> 
 * Versioning
 * 
 * @author: <Thomas Urlacher, Denis Schülle> 
 * Last Change: <2019.03.28>
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorImpl implements Calculator {
	
	//	Attribute
	private List<Integer> intList;

	//	Constructor
	public CalculatorImpl() {
		this.intList = new ArrayList<Integer>();
	}
	
	//	Methods

	 /*
     * @return Maximum from ArrayList integers
     */
	@Override
	public int getMaximum() {
		if(intList.size()== 0) return 0 ;
    	Collections.sort(intList);
    	return intList.get(intList.size()-1);	}

	/*
     * @return Minimum from ArrayList integers
     */
	@Override
	public int getMinimum() {
		if(intList.size()== 0) return 0 ;
    	Collections.sort(intList);
    	return intList.get(0);
	}

	 /*
     * add int to ArrayList integers
     */
	@Override
	public void addValue(int value) {
		if(intList == null) return;
    	intList.add(value);
	}
	
	/*
     * @return sum from ArrayList integers
     */
	@Override
	public int sum() {
		if(intList == null) return 0;
    	int sum = 0;
    	for (Integer integer : intList) {
			sum += integer;
		}
    	
    	return sum;
	}

}
