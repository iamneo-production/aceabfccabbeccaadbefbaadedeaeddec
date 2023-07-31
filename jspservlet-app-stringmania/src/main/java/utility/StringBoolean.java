package utility;

public class StringBoolean {
//	Enter the code here....
private String input1;
private String input2;

public String getInput1() {
    return input1;
}

public void setInput1(String input1) {
    this.input1 = input1;
}

public String getInput2() {
    return input2;
}

public void setInput2(String input2) {
    this.input2 = input2;
}

public boolean containsString(String str) {
    return input1.contains(str);
}

public boolean startsWithLetter(String letter) {
    return input1.startsWith(letter);
}

public boolean endsWithLetter(String letter) {
    return input1.endsWith(letter);
}

public boolean areEqual(String str) {
    return input1.equals(str);
}

public boolean areEqualIgnoreCase(String str) {
    return input1.equalsIgnoreCase(str);
}
}
