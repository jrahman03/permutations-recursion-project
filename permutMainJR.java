// Jewel Rahman 5/5/22 CS211

// This class contains the method "permut" that
//accepts two integers n and r as parameters 
//and returns the number of unique permutations of r items from a group of n items. 
package permutJR;

public class permutMainJR {

	public static void main(String[] args) {
		// println statements to tests certain cases
		System.out.println("Test Case 1 (5,3): " + permut(5,3)); // test case 1
		System.out.println("Test Case 2 (5,1): " + permut(5,1)); //test case 2 REQUIRED FOR QA
		System.out.println("Test Case 3 (55,5): " + permut(55,5)); //test case 3 REQUIRED FOR QA
	}
	
	// recursive method that returns unique permutations of r items from a group of n items
	public static int permut(int n, int r) {
		// base case 
		if (r == 1) {
			return n;
		// recursive case	
		} else {
			return n * permut(n-1, r-1); // multiply the number of items(n) by (n-1, r-1) until r=1 // -1 is there to decrement every time the recursive case is executed
		}
	}

}
