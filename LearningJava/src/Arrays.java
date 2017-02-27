
public class Arrays {

	public static void main(String[] args) {
		
		//make [] next to variable type to create an array
		int[] values; 
		values = new int[3];
		
		System.out.println(values[0]); //this means first value of the array
		//Java automatically assign 0,0,0 to the array so right now output = 0
		
		//Way 1 of adding values to an array
		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		
		System.out.println(values[0]); //it's output will be 10
		
		// printing array in for-loop
		for(int i=0; i<values.length; i++)
		{
			System.out.printf("Value is: %d\n",values[i]);
		}
		
		//Way two of adding values to an array
		int[] numbers = {4,5,3,2,1};
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.printf("Number is: %d\n",numbers[i]);
		}
		
		////////STRINGS IN ARRAY\\\\\\\\\\\\\
		String[] words = {"hello", "John", "Doe"};
		
		//by default if we do not init, java init values for us
		//in strings case it init null and in int case it init 0
		
		//Printing strings will not be the same as int in a for-loop
		for(String myWord: words)
		{
			System.out.printf(myWord);
		}
		
		////////MULTI-DIMENTIONAL ARRAY\\\\\\\\\\\\\
	   
		//Before going into multi-dimention let's take an example of chess board
		//Image a chess board grid. It's an 8x8 grid.
		//One dim array can hold a value of one row or column. 
		//It can be diagonal row, vertical, horizontal row
		
		//now a multi-dim array can hold the complete 8x8 grid
		
		//We put brackets two times which declaring [][]
		
		int[][] grid = {
				{4,3,2},
				{5,4,3},
				{68,67,22}
		};
		
		//to print it
		System.out.println(grid[0][1]);
		
		/*
		 * The first [0] tells us which block to pick
		 * in this case it'll pick {4,3,2} block
		 * The second [1] tells us which value to pick from that block
		 * in this case it'll be 3
		 * */
		
		//Strings in Multi-Dim Array
		String[][] messages = new String[2][4];
		
		
	}

}
