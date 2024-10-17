package org.example.decorator_final_class;

public class StringDecorator {
    private final String str;
    public StringDecorator(String str) {
        this.str = str;
    }
    public String toLowerCase() {
        return str.toLowerCase();
    }

    public char centerCharacter(){
        return str.charAt(str.length()/2);
    }
}
