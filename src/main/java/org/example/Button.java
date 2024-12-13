package org.example;

public class Button {
    private int clickCount;

    public void click(){
        clickCount++;
    }

    public int getClickCount() {
        return clickCount;
    }
}
