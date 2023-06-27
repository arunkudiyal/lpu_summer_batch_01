package com.company;

import java.util.Scanner;

public class IntroductionToGraphs {
    // Data
    int V;
    int[][] graph;
    IntroductionToGraphs(int vertices) {
        this.V = vertices;
        this.graph = new int[V][V];
    }
    public void display() {
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
                            6
                            0 1 0 1 0 1
                            1 0 1 1 1 0
                            0 1 0 1 1 1
                            1 1 1 0 1 0
                            0 1 1 1 0 1
                            1 0 1 0 1 0
         */
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        IntroductionToGraphs g = new IntroductionToGraphs(V);                       // V = 6, graph[6][6];
        for(int i=0; i < g.V; i++) {                                                // i = 0 1 2 3 4 5
            for(int j=0; j < g.V; j++) {                                            // j = 0 1 2 3 4 5
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.display();
    }
}
