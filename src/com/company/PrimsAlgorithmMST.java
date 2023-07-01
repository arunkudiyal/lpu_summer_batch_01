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
        int[] parent = new int[V];
        for(int i=0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        // Step3 -> Make the entry point of the graph
        cost[0] = graph[0][0];
        parent[0] = -1;
        // for in total of V-1 edges
        for(int i=0; i < V-1; i++) {
            // minCostVertex is a function which gives the value of the vertex
            // which has not been visited but has the least cost
            int u = minCostVertex(cost, visited);
            visited[u] = true;
            // I am looking for all the neighbors of u
            for(int v=0; v < V; v++) {
                // if(there is an edge AND not visited AND the cost is min
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] <= cost[v]) {
                    parent[v] = u;
                    cost[v] = graph[u][v];
                }
            }
        }
        // Printing the total sum of the MST
        //        int totalCost = 0;
        //        for(int i=0; i < V; i++)
        //            totalCost += cost[i];
        //        System.out.println(totalCost);
        // Create a display which is going to build the MST
        display(parent, this.graph);
    }
    public void display(int[] parent, int[][] graph) {
        System.out.println("S_To_D\tCost");
        for(int i=1; i < V; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }
    public int minCostVertex(int[] cost, boolean[] visited) {
        int min = Integer.MAX_VALUE; int min_vertex = -1;
        for(int i=0; i < V; i++) {
            if(cost[i] <= min && !visited[i]) {
                min = cost[i];
                min_vertex = i;
            }
        }
        return  min_vertex;
    }
/*
9
0 4 0 0 0 0 0 8 0
4 0 8 0 0 0 0 11 0
0 8 0 7 0 4 0 0 2
0 0 7 0 9 14 0 0 0
0 0 0 9 0 10 0 0 0
0 0 4 14 10 0 2 0 0
0 0 0 0 0 2 0 1 6
8 11 0 0 0 0 1 0 7
0 0 2 0 0 0 6 7 0
37
*/
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
