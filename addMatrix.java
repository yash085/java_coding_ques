package com.example.tech;

public class addMatrix {
    private static int N=4;
    public static void add(int A[][], int B[][], int C[][])
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < N; j++)
                C[i][j] = A[i][j] + B[i][j];
    }
    public static void main(String[] args) {
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        // To store result
        int C[][] = new int[N][N];
        add(A,B,C);
        for (int  c = 0 ; c < N ; c++ ) {
            for (int d = 0; d < N; d++)
                System.out.print(C[c][d] + "\t");
            System.out.println();
        }

    }
}
