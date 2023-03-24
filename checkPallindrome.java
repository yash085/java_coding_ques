package com.example.tech;
import java.util.*;

public class checkPallindrome{
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string/number");
        original = sc.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("String/number is a palindrome.");
        else
            System.out.println("String/number isn't a palindrome.");
    }
}
