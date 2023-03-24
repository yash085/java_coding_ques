package com.example.tech;

public  class PrimeTriplets {
    public static boolean isPrime(int n) {
        for(int i=2; i<n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i=2; i<=494; i++){
            if(isPrime(i) && isPrime(i+2) && isPrime(i+6))
                System.out.println(i+ " "+ (i+2) +" " + (i + 6));
            else if (isPrime(i) && isPrime(i+4) && isPrime(i+6)) {
                System.out.println(i+ " "+ (i+4) +" " + (i + 6));
            }
        }
    }
}