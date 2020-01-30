public class Lab1 {
    public static void main(String[] args) {
	//Some test code
	ArraySwap swapper = new ArraySwap();
	int[] a = {1, 2, 3};
	int[] b = a;
	System.out.println(swapper.arrayEquals(a,b));

	int[] arr = {1, 1, 2, 3, 4, 1, 5, 6, 8, 7, 9, 9 , 8, 9, 1};
	ArraySwap c = new ArraySwap();
	arr = c.removeDuplicates(arr);
	for(Integer i : arr) {
	    System.out.print(i);
	}
	System.out.println();
	
    }

    /*
      Return true if the values in a are the same as the values in b
     */
    public boolean arrayValuesEqual(int[] a, int[] b) {
	return false;
    }

    /*
      Return true if a and b point to the same array
     */
    public boolean arrayEquals(int[] a, int[] b) {
	return false;
    }

    /*
     * Swap a and b WITHOUT doing an elementwise copy.
     */
    public void swap(int[] a, int[] b) {

    }


    /*
     * Returns true if a and b have the same name
     */

    public boolean sameName(Person a, Person b) {
	return false;
    }


    /*
     * Given an array of positive integers, removes duplicates
     * in the array.
     * @return a contiguous array with the remaining integers 
     * with a length equal to the number of remaining integers
     */
    public int[] removeDuplicates(int[] integers) {
	return new int[0];
    }
  
}
