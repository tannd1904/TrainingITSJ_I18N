package com.example.demoi18n;

import com.example.demoi18n.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.ResourceBundle;

@RestController
public class Controller {

    HelloWorldStr helloWorld = new HelloWorldStr();

    @GetMapping("/helloworld/en")
    public HelloWorldStr HelloEng() {
        ResourceBundle bundle = ResourceBundle.getBundle("HelloWorld", Locale.US);
//        Locale helloWorldEn = new Locale("Hello World");
        helloWorld.setGreeting(bundle.getString("hello"));
        return helloWorld;
    }

    @GetMapping("/helloworld/vn")
    public HelloWorldStr HelloVn() {
        Locale.setDefault(new Locale("vn", "VN"));
        ResourceBundle bundle = ResourceBundle.getBundle("HelloWorld");
//        Locale helloWorldVn = new Locale("Xin chào");
//        helloWorld.setContent(helloWorldVn);
        helloWorld.setGreeting(bundle.getString("hello"));
        return helloWorld;
    }
}
