// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            //input: RUNI 5
            /*output:
             * Give me an R: R!
                Give me a U: U!
                Give me an N: N!
                Give me an I: I!
                What does that spell?
                RUNI!!!
                RUNI!!!
                RUNI!!!
                RUNI!!!
                RUNI!!!
             */
                String str = args[0];
                str = str.toUpperCase();
                int yell = Integer.parseInt(args[1]);
                boolean bANCheck = false;
                char[] ANCheck = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
                for (int i = 0; i < str.length(); i++){
                        //System.out.println("Give me " + ());
                        for (char c : ANCheck){
                                if (str.charAt(i) == c){
                                        bANCheck = true;
                                        break;
                                }
                        }
                        System.out.println("Give me " + (bANCheck ? "an ":"a  ") + str.charAt(i) + ": " + str.charAt(i) + "!");
                        bANCheck = false;
                }
                System.out.println("What does that spell?");    
                for (int i = 0; i < yell; i++){
                        System.out.println(str + "!!!");
                }            


        }
}
