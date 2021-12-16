public class PhraseOmatic {

        public static void main (String[] args) {
	
	String[] wordlistone = {"24/7" , "multi-tier", "30,000 foot" , " six-sigma" , "dynamic" };

	String[] wordlisttwo = {"24/7" , "multi-tier", "30,000 foot" , " six-sigma" , "dynamic" }; 

	String[] wordlistthree = {"24/7" , "multi-tier", "30,000 foot" , " six-sigma" , "dynamic" }; 

	int onelength = wordlistone.length;
	int twolength = wordlisttwo.length;
 	int threelength = wordlistthree.length;

	int rand1 = (int) (Math.random() * onelength);
	int rand2 = (int) (Math.random() * twolength);	
	int rand3 = (int) (Math.random() * threelength);

	String phrase = wordlistone[rand1] + " " + wordlisttwo[rand2] + " " + wordlistthree[rand3];

	System.out.println("what we need is a " + phrase);
	}
}		
 
 
