public class TypingAccuracyChecker {
    public void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;
        char expected = ' ';
        char actual = ' ';
        
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i + 1;
                expected = original.charAt(i);
                actual = typed.charAt(i);
            }
        }
        
        int total = original.length();
        double accuracy = ((double) matched / total) * 100.0;
        String accStr = String.format("%.2f%%", accuracy);
        
        if (firstMismatch == -1) {
            System.out.println("Matched: " + matched + "/" + total + " | Accuracy: " + accStr + " | No Mismatches");
        } else {
            System.out.println("Matched: " + matched + "/" + total + " | Accuracy: " + accStr + " | First Mismatch at position " + firstMismatch + " ('" + expected + "' vs '" + actual + "')");
        }
    }
}
