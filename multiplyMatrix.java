package com.example.tech;

public class multiplyMatrix {
    private static int N=4;
    public static void multiply(int mat1[][],
                                int mat2[][], int res[][])
    {
        int i, j, k;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                res[i][j] = 0;
                for (k = 0; k < N; k++)
                    res[i][j] += mat1[i][k]
                            * mat2[k][j];
            }
        }
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
        multiply(A,B,C);
        for (int  c = 0 ; c < N ; c++ ) {
            for (int d = 0; d < N; d++)
                System.out.print(C[c][d] + "\t");
            System.out.println();
        }

    }
}
