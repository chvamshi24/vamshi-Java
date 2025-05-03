
public class ArrayMultiDimention {

	public static void main(String[] args) {
		int[] values = {3, 4, 234};
		
		System.out.println(values[2]);
		
		int[][] grid = {
				{3, 4, 234},
				{1,2},
				{3, 6, 8, 4}
				
		};
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
		
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
		
		String[][] words = new String[2][];
		
		System.out.println(words[1]);
		
		words[0] = new String[3];
		words[0][1] = "hi here";
		System.out.println(words[0][1]);
	}

}
