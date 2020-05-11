//Emma Sewell - Using an array to create a table 
//Example 5 and 6
public class Arrays_1D_03 {
public static void main(String [] args){

//int j= 149;	
	
	// Create 2-dimensional array.
		int[][] values = new int[5][5];

		values[0][0] = 1;
		values[0][1] = 2;
		values[0][2] = 3;
		values[0][3] = 4;
		values[0][4] = 5;
		values[1][0] = 6;
		values[1][1] = 7;
		values[1][2] = 8;
		values[1][3] = 9;
		values[1][4] = 10;
		values[2][0] = 11;
		values[2][1] = 12;
		values[2][2] = 13;
		values[2][3] = 14;
		values[2][4] = 15;
		values[3][0] = 16;
		values[3][1] = 17;
		values[3][2] = 18;
		values[3][3] = 19;
		values[3][4] = 20;
		values[4][0] = 21;
		values[4][1] = 22;
		values[4][2] = 23;
		values[4][3] = 24;
		values[4][4] = 25;
		

		// Loop over top-level arrays.
		for (int i = 0; i < values.length; i++) {

		    // Loop and display sub-arrays.
		    int[] sub = values[i];
		    for (int x = 0; x < sub.length; x++) {
			System.out.print(sub[x] + " ");
		    }
		    System.out.println();
		}
}	
	
}