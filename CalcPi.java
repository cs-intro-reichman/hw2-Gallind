// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		/*output:
		pi according to Java: 3.141592653589793
		pi, approximated: 3.140592653839794
		*/
		int intervals = Integer.parseInt(args[0]);
		boolean isAdd = false;
		Double sum = 1.0;
		Double div = 3.0;

		for (int i = 1; i < intervals; i++){
			if (isAdd){
				sum += (1 / div);
			} else {
				sum -= (1 / div);
			}
			isAdd = !isAdd;
			div += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);

	}
}
