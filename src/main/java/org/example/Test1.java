package org.example;

import org.springframework.stereotype.Component;

@Component
public class Test1 {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("Test1");
    }
    public String display(String name) {
        return name;
    }
}
