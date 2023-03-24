package com.example.tech;

public class CompareString {
    public static void main(String[] args) {
        String a = "object", b="classes";
        if(a.equals(b))
            System.out.println("Equal String");
        else
            System.out.println("Not Equal String");
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
    }
}
