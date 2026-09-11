public class WordReversalEncoder {
    public String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed = new StringBuilder(words[i]).reverse();
            result.append(reversed);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        System.out.println(result.toString());
        return result.toString();
    }
}
