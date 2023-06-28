package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BFSGraph {
    int V;
    int[][] graph;
    BFSGraph(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        // initialising the values of all the vertices as F
        for(int i=0; i < V; i++) visited[i] = false;
        // Queue for inserting the neighbors
        ArrayList<Integer> q = new ArrayList<>();
        // add the first vertex to the queue
        q.add(start);
        visited[start] = true;
        int current;
        while(!q.isEmpty()) {
            current = q.get(0);
            // print the current value and remove from the queue
            System.out.print(current + " ");
            q.remove( q.get(0) );
            // check for the neighbors where the edge exists but is not explored
            for(int i=0; i < V; i++) {
                if(graph[current][i] == 1 && (!visited[i])) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        BFSGraph g = new BFSGraph(V);                                           // V = 5
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.BFS(0);                                                           // 0 1 2 3 4
    }
}
