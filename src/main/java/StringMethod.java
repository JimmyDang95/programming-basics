public class StringMethod {
    public static void main(String[] args) {

        // boolean result = checkIfStringLengthIsGreaterThan20("Willkommen");

        String word = "WillkommenWillkommenWillkommen";
        System.out.println(checkIfTheWordHasMoreThan20Chars(word));

        String word2 = "fancyHency";
        System.out.println("Does the word contains fancy? " + checkIfTheWordContainsFancy(word2));
    }

    public static boolean checkIfTheWordContainsFancy(String word){
        if (word.contains("fancy")){
            return true;
        } else {
            return false;
        }
    }

    public static String checkIfTheWordHasMoreThan20Chars(String word){
        if (word.length() < 20){
            return "Your word " + word + " has less than 20 chars";
        } else {
            return "The word has more than 20 chars";
        }
    }

}
