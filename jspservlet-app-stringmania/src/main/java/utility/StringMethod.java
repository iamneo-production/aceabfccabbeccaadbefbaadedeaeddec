package utility;

public class StringMethod {
//	Enter the code here....
private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String toLowerCase() {
        return input.toLowerCase();
    }

    public String toUpperCase() {
        return input.toUpperCase();
    }

    public String firstChar() {
        return String.valueOf(input.charAt(0));
    }

    public int length() {
        return input.length();
    }

    public String trim() {
        return input.trim();
    }
}
