import java.util.Scanner;

public class aquinas {
	public static void main(String [] args) {
		
		int [] [] numberGrid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		
		for(int i = 0; i < numberGrid.length; i++) {
			System.out.print("{");
			for(int j = 0; j < numberGrid[i].length; j++) {
				if(numberGrid[i][j] == 3 || numberGrid[i][j] == 6 || numberGrid[i][j] == 9 || numberGrid[i][j] == 0) {
					System.out.print(numberGrid[i][j]);
				} else {
					System.out.print(numberGrid[i][j] + ", ");
				}
					
			}
			System.out.println("}");
		}
	}
}
