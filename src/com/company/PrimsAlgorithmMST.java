package com.company;

import java.util.Scanner;

public class PrimsAlgorithmMST {
    int V;
    int[][] graph;
    PrimsAlgorithmMST(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public void primsMST(int[][] graph) {
        // Step1 -> Create a track of all the visited vertices
        boolean[] visited = new boolean[V];
        // Step2 -> Create a track of the min cost for reaching the vertex V
        int[] cost = new int[V];
        for(int i=0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        // Step3 -> Make the entry point of the graph
        cost[0] = graph[0][0];
        for(int i=0; i < V; i++) {
            // minCostVertex is a function which gives the value of the vertex
            // which has not been visited but has the least cost
            int u = minCostVertex(cost, visited);
            visited[u] = true;
            // I am looking for all the neighbors of u
            for(int v=0; v < V; v++) {
                // if(there is a edge AND not visited AND the cost is min
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] < cost[v]) {
                    cost[v] = graph[u][v];
                }
            }
        }
        // Create a display which is going to build the MST

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        PrimsAlgorithmMST mst = new PrimsAlgorithmMST(V);
        // input for the graph
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                mst.graph[i][j] = sc.nextInt();
            }
        }
        mst.primsMST(mst.graph);
    }
}
