// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	        // Getting inputs
                String word = args[0].toUpperCase();
                int count = Integer.parseInt(args[1]);
                
                //printing the spelling
                for (int i = 0; i < word.length(); i++) {
                        String a = "a ";
                        String search = "AEFHILMNORSX";
                        if (search.indexOf(word.charAt(i)) >= 0) {
                                a = "an";
                        }
                        System.out.println("Give me " + a + " " +
                                        word.charAt(i) + ": " + word.charAt(i) + "!");
                }

                //printing the word number of count
                System.out.println("What does that spell?");
                for (int i = 0; i < count; i++) {
                        System.out.println(word + " ! ! !");
            }

        }
}
