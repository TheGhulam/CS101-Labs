public class Lab02_Q3_modified {
    public static void main(String args[]){
        String phrase = "War and Peace";

        // For reference
        // String phrase = "War and Peace";
        //                            012 3 456 7 89101112

        phrase = phrase.substring(4,8) + phrase.substring(8,11) + Character.toUpperCase(phrase.charAt(11)) + phrase.substring(12) + phrase.charAt(3) + phrase.substring(0,3);
        System.out.println(phrase);
    }
}
