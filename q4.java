public class LibraryIsbnValidator {
    public String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public String validateAndFormat(String code) {
        if (code.length() != 13) {
            String error = "Invalid: wrong length";
            System.out.println(error);
            return error;
        }
        
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                String error = "Invalid: publisher code must be 3 letters";
                System.out.println(error);
                return error;
            }
        }
        
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                String error = "Invalid: non-digit body";
                System.out.println(error);
                return error;
            }
        }
        
        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);
        
        String formatted = "[" + pubCode + "] YEAR: " + year + " | CATALOG: " + catalog;
        System.out.println(formatted);
        return formatted;
    }
}
