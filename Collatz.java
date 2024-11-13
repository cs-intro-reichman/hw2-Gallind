// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		/*
		 * Input: Collatz 7 v
		 * Output:
	    1 4 2 1 (4)
		2 1 (2)
		3 10 5 16 8 4 2 1 (8)
		4 2 1 (3)
		5 16 8 4 2 1 (6)
		6 3 10 5 16 8 4 2 1 (9)
		7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 (17)
		Every one of the first 7 hailstone sequences reached 1.
		 * 
		 * Input: Collatz 100 c
		 * Output:
		 * Every one of the first 100 hailstone sequences reached 1.
		 */

		 //String Mode = args[1];
		 boolean bMode = args[1].charAt(0) == 'v';
		 int intervals = Integer.parseInt(args[0]);
		 int j = 1;
		 int x = 1;
		 boolean firstOne = true;
		 String msgLine = "";
		
		 if (bMode){
			for (int i = 1; i <= intervals; i++){
				j = i;
				while (j != 1 || firstOne){
					firstOne = false;
					msgLine += String.valueOf(j) + " ";
					if (j % 2 == 0){
						j = j / 2;
					}
					else {
						j = j * 3 + 1;
					}
					x++;
				}
				msgLine += "1 (" + x + ")";
				System.out.println(msgLine);
				msgLine = "";
				x = 1;
				firstOne = true;
			}
		 }
		 
		 System.out.println("Every one of the first " + intervals + " hailstone sequences reached 1.");
	}
}
