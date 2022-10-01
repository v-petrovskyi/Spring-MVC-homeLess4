package com.homeTask.entity;

public class SomeText {
    public static int count;
    private String text;

    {
        count++;
    }

    public SomeText() {
    }

    public SomeText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
