// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		/*output:
		pi according to Java: 3.141592653589793
		pi, approximated: 3.140592653839794
		*/
		int Intervals = Integer.parseInt(args[0]);
		boolean IsAdd = false;
		Double Sum = 1.0;
		Double Div = 3.0;

		for (int i=1; i<Intervals; i++){
			if (IsAdd){
				Sum += (1/Div);
			}
			else {
				Sum -= (1/Div);
			}
			IsAdd = !IsAdd;
			Div += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + Sum*4);

	}
}
