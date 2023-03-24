package com.example.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Child {

    public void print(){
        System.out.println("Hi from Child");
    }
    public static void main(String args[]){
        List <String> names = Arrays.asList("Naman", "Ram", "Aditya");
      List<Integer> out= names.stream().map(e-> 1).collect(Collectors.toList());
      System.out.println(out);
      //out.forEach(System.out::println);
      float f =5.0f;
      int k = (int) f;
      float m = k;
      System.out.println(m);
    }
}