import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
	}
	
	public testSelectionSort() {
	}
	
	public void testPositive() {
		int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 9;
	    arr[2] = 7;
	    arr[3] = 10;
	    arr[4] = 2;
	        
	    SelectionSort temp1 = new SelectionSort();
	    int fixedArr[] = temp1.sort(arr);
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr[i]);
	    	assertTrue(arr[i] > 0);
	    }
	}
	
	public void testNegative() {
		int[] arr2 = new int[5];
	    arr2[0] = -8;
	    arr2[1] = -9;
	    arr2[2] = -7;
	    arr2[3] = -10;
	    arr2[4] = -2;
	        
	    SelectionSort temp2 = new SelectionSort();
	    int fixedArr2[] = temp2.sort(arr2);
	    System.out.println("\n");
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr2[i]);
	    	assertTrue(arr2[i] < 0);
	    } 
	}
	
	public void testMixed() {
		int c1 = 0; int c2 = 0; int c3 = 0;
		int[] arr3 = new int[5];
	    arr3[0] = 8;
	    arr3[1] = 9;
	    arr3[2] = 0;
	    arr3[3] = -10;
	    arr3[4] = -2;
	        
	    SelectionSort temp3 = new SelectionSort();
	    int fixedArr3[] = temp3.sort(arr3);
	    System.out.println("\n");
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr3[i]);
	    	if (arr3[i] > 0) {
	    		c1++;
	    	}
	    	if (arr3[i] < 0) {
	    		c2++;
	    	}
	    	if (arr3[i] == 0) {
	    		c3++;
	    	}
	    }
	    assertTrue(c1 > 0);
	    assertTrue(c2 > 0);
	    assertTrue(c3 > 0); 
	}
	
}
