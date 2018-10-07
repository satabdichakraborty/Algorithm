package org.tutorial.minesweep;

public class MS {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your
		// solution.
		int[][] bombs1 = { { 0, 2 }, { 2, 0 } };
		mineSweeper(bombs1, 3, 3);
		// should return:
		// [[0, 1, -1],
		// [1, 2, 1],
		// [-1, 1, 0]]

		int[][] bombs2 = { { 0, 0 }, { 0, 1 }, { 1, 2 } };
		// mineSweeper(bombs2, 3, 4);
		// should return:
		// [[-1, -1, 2, 1],
		// [2, 3, -1, 1],
		// [0, 1, 1, 1]]

		int[][] bombs3 = { { 1, 1 }, { 1, 2 }, { 2, 2 }, { 4, 3 } };
		// mineSweeper(bombs3, 5, 5);
		// should return:
		// [[1, 2, 2, 1, 0],
		// [1, -1, -1, 2, 0],
		// [1, 3, -1, 2, 0],
		// [0, 1, 2, 2, 1],
		// [0, 0, 1, -1, 1]]
	}

	// Implement your solution below.
	public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
		int[][] field = new int[numRows][numCols];
		int noOfBombs = 0;

		for (int row = 0; row < field.length; row++) {

			for (int col = 0; col < field[row].length; col++) {
				field[row][col] = 0;
			}
		}

		for (int i = 0; i < bombs.length; i++) {
			int row = 0;
			int col = 0;
			noOfBombs++;
			for (int j = 0; j < bombs[i].length; j++) {
				if (j == 0) {
					row = bombs[i][j];
				}
				if (j == 1) {
					col = bombs[i][j];
				}

			}
			// System.out.println("Co-ordinates of "+noOfBombs+" bomb: "+row + "
			// "+ col);
			field[row][col] = -1;
		}
		
		// Just printing last:
		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col++) {
				System.out.print(field[row][col] + " ");
			}
			System.out.println(" ");
			
		}
		System.out.println("====================================================");
		for (int row = 0; row < field.length; row++) {
			boolean isBomb = false;
			int val = 0;
			for (int col = 0; col < field[row].length; col++) {
				val = field[row][col];
				isBomb = false;
				// System.out.println("val = "+val);
				if (val == -1) {
					isBomb = true;
				}
				if (isBomb) {
					//top left corner item
					if (row == 0 && col == 0) 
					{
						if(field[row + 1][col    ] != -1)
							field[row + 1][col    ] = field[row + 1][col    ] + 1;
						if(field[row + 1][col + 1] != -1)
							field[row + 1][col + 1] = field[row + 1][col + 1] + 1;
						if(field[row    ][col + 1] != -1)
							field[row    ][col + 1] = field[row    ][col + 1] + 1;
					} 
					//top right corner item
					else if (row == 0 && col == (field[row].length - 1)) 
					{
						if(field[row + 1][col] != -1)
							field[row + 1][col    ] = field[row + 1][col    ] + 1;
						if(field[row + 1][col - 1] != -1)
							field[row + 1][col - 1] = field[row + 1][col - 1] + 1;
						if(field[row    ][col - 1] != -1)
							field[row    ][col - 1] = field[row    ][col - 1] + 1;
					}
					//bottom right corner item
					else if (row == (field.length - 1) && col == (field[row].length - 1)) 
					{
						if(field[row - 1][col] != -1)
							field[row - 1][col    ] = field[row - 1][col    ] + 1;
						if(field[row - 1][col - 1] != -1)
							field[row - 1][col - 1] = field[row - 1][col - 1] + 1;
						if(field[row    ][col - 1] != -1)
							field[row    ][col - 1] = field[row    ][col - 1] + 1;
					}
					//bottom row left corner
					else if (row == (field.length - 1) && col == 0) 
					{
						if(field[row - 1][col    ] != -1)
							field[row - 1][col    ] = field[row - 1][col   ] + 1;
						if(field[row - 1][col + 1] != -1)
							field[row - 1][col + 1] = field[row - 1][col + 1] + 1;
						if(field[row    ][col + 1] != -1)
							field[row    ][col + 1] = field[row    ][col + 1] + 1;
						
					}
					//top row
					else if(row == 0)
					{
						if(field[row + 1][col + 1] != -1)
							field[row + 1][col + 1] = field[row + 1][col + 1] + 1;
						if(field[row + 1][col] != -1)
							field[row + 1][col] 	= field[row + 1][col] + 1;
						if(field[row + 1][col - 1] != -1)
							field[row + 1][col - 1] = field[row + 1][col - 1] + 1;
						if(field[row][col - 1] != -1)
							field[row][col - 1] 	= field[row][col - 1] + 1;
						if(field[row][col + 1] != -1)
							field[row][col + 1] 	= field[row][col + 1] + 1;
					}
					//last row
					else if(row == (field.length - 1)){
						if(field[row - 1][col + 1]!= -1)
							field[row - 1][col + 1] = field[row - 1][col + 1] + 1;
						if(field[row - 1][col] != -1)
							field[row - 1][col] 	= field[row - 1][col] + 1;
						if(field[row - 1][col - 1]!= -1)
							field[row - 1][col - 1] = field[row - 1][col - 1] + 1;
						if(field[row][col - 1]!= -1)
							field[row][col - 1] 	= field[row][col - 1] + 1;
						if(field[row][col + 1]!= -1)
							field[row][col + 1] 	= field[row][col + 1] + 1;
					}
					//first column
					else if(col == 0)
					{
						if(field[row + 1][col + 1] != -1)
							field[row + 1][col + 1] = field[row + 1][col + 1] + 1;
						if(field[row + 1][col    ]	!= -1)
							field[row + 1][col    ]	= field[row + 1][col] + 1;
						if(field[row - 1][col + 1]!= -1)
							field[row - 1][col + 1] = field[row - 1][col + 1] + 1;
						if(field[row - 1][col    ]	!= -1)
							field[row - 1][col    ]	= field[row - 1][col] + 1;
						if(field[row    ][col + 1]!= -1)
							field[row    ][col + 1] = field[row][col + 1] + 1;
					}
					//last column
					else if(col == (field[row].length - 1)){
						if(field[row + 1][col - 1]!= -1)
							field[row + 1][col - 1] = field[row + 1][col - 1] + 1;
						if(field[row - 1][col - 1]!= -1)
							field[row - 1][col - 1] = field[row - 1][col - 1] + 1;
						if(field[row    ][col - 1]!= -1)
							field[row    ][col - 1] = field[row][col - 1] + 1;
						if(field[row + 1][col    ]!= -1)
							field[row + 1][col    ] = field[row + 1][col] + 1;
						if(field[row - 1][col    ]!= -1)
							field[row - 1][col    ] = field[row - 1][col] + 1;
					}
					else 
					{
						if(field[row + 1][col + 1]!= -1)
							field[row + 1][col + 1] = field[row + 1][col + 1] + 1;
						if(field[row + 1][col    ]!= -1)
							field[row + 1][col    ]	= field[row + 1][col] + 1;
						if(field[row + 1][col - 1]!= -1)
							field[row + 1][col - 1] = field[row + 1][col - 1] + 1;
						if(field[row - 1][col + 1]!= -1)
							field[row - 1][col + 1] = field[row - 1][col + 1] + 1;
						if(field[row - 1][col    ]!= -1)
							field[row - 1][col    ]	= field[row - 1][col] + 1;
						if(field[row - 1][col - 1]!= -1)
							field[row - 1][col - 1] = field[row - 1][col - 1] + 1;
						if(field[row][col - 1]!= -1)
							field[row][col - 1] 	= field[row][col - 1] + 1;
						if(field[row][col + 1]!= -1)
							field[row][col + 1] 	= field[row][col + 1] + 1;
					}
				}
			}			
		}

		// Just printing last:
		for (int row = 0; row < field.length; row++) {

			for (int col = 0; col < field[row].length; col++) {
				System.out.print(field[row][col] + " ");
			}
			System.out.println(" ");
		}

		return field;
	}
}
