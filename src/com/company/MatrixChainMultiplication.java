package com.company;

import java.util.Scanner;

public class MatrixChainMultiplication {
    int[][] memo;
    public int matrixChainMultiplicationUtil(int[] dimensions, int i, int j) {
        // M[00], M[11], M[22], M[33]
        if(i == j) return 0;
        if(memo[i][j] != -1) return memo[i][j];
        memo[i][j] = Integer.MAX_VALUE;
        for(int k=i; k < j; k++) {
            int cost = matrixChainMultiplicationUtil(dimensions, i, k) + matrixChainMultiplicationUtil(dimensions, k+1, j) + (dimensions[i-1] * dimensions[k] * dimensions[j]);
            memo[i][j] = Math.min(memo[i][j], cost);
        }
        return memo[i][j];
    }
    public int matrixChainMultiplication(int[] arr) {
        int n = arr.length;
        memo = new int[n][n];
        for(int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {
                // -1 indicates that the no of multiplication is not calculated yet.
                memo[i][j] = -1;
            }
        }
        return matrixChainMultiplicationUtil(arr, 1, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++)
            arr[i] = sc.nextInt();
        MatrixChainMultiplication mcm = new MatrixChainMultiplication();
        int ans = mcm.matrixChainMultiplication(arr);
        System.out.println(ans);
    }
}
