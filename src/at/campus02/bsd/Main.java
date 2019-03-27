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
	
	public static List<Integer> integers = new ArrayList<Integer>();

    public static void main(String[] args){
    	
    	//Test get Minimum
    	addValue(34);
    	addValue(333);
    	addValue(-5);
    	System.out.println("Minimum: " + getMinimum());
    	
    	
    	

    }
    
    
    /*
     * return Minimum from ArrayList integers
     */
    public static int getMinimum() {
    	Collections.sort(integers);
    	return integers.get(0);
    	
    }
    
    public static void getMaximum() {
    	
    	
    }
    
    
    /*
     * add int to ArrayList integers
     */
    public static void addValue(int addInteger) {
    	
    	integers.add(addInteger);
    	
    }

}
