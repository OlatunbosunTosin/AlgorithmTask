public class ShortestWordInSentence {
    public static String findShortestWord(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        int minLength = Integer.MAX_VALUE;
        String leastLength = "";
        String regex = "[A-Za-z]+";
        for (String word : sentenceArray){
            if(word.matches(regex) && word.length() < minLength){
                minLength = word.length();
                leastLength = word;
            }
        }return leastLength;
    }
}
