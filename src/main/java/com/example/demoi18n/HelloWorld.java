package com.example.demoi18n;

import java.util.Locale;

public class HelloWorld {
    private Locale content;

    public Locale getContent() {
        return content;
    }

    public void setContent(Locale content) {
        this.content = content;
    }

    public HelloWorld() {
    }

    public HelloWorld(Locale content) {
        this.content = content;
    }
}
