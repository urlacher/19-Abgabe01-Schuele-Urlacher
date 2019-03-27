package at.campus02.bsd;
import java.util.*;

/**
 * <2019.03.27 - Aufgabe 01> 
 * Versioning
 * 
 * @author: <Thomas Urlacher, Denis Schülle> 
 * Last Change: <2019.03.27>
 */

public class Main {
	
	static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args){
    	
    	//Test get Minimum
    	addValue(34);
    	addValue(333);
    	addValue(-5);
    	System.out.println("Minimum: " + getMinimum());
    	
    	//Test get Maximum
    	System.out.println("Maximum: " + getMaximum());
    	
    	//Test sum
    	System.out.println("Sum: " + sum());
    }
    
    /*
     * @return sum from ArrayList integers
     */
    public static int sum() {
    	int sum = 0;
    	for (Integer integer : list) {
			sum += integer;
		}
    	
    	return sum;
    }
    
    /*
     * @return Minimum from ArrayList integers
     */
    public static Integer getMinimum() {
    	Collections.sort(list);
    	return list.get(0);
    }
    
    /*
     * @return Maximum from ArrayList integers
     */
    public static Integer getMaximum() {
    	Collections.sort(list);
    	return list.get(list.size()-1);
    	
    }    
    
    /*
     * add int to ArrayList integers
     */
    public static void addValue(int addInteger) {
    	
    	list.add(addInteger);
    	
    }
}
