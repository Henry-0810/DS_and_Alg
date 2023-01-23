package Lab1.Q3;

import javax.swing.text.AttributeSet;

public class TestInitials {
    public static String getInitials(String name) {
        String initial = "";
        initial += Character.toUpperCase(name.charAt(0)) + ". ";
        for (int i = 0; i < name.length(); i++) {
            if (i > 1) {
                if (Character.isWhitespace(name.charAt(i - 1))) {
                    initial += Character.toUpperCase(name.charAt(i)) + ".";
                }
            }
        }
        return initial;
    }
}

