package com.company;

import java.util.Scanner;

public class DijkstraAlgorithm {
    int V;
    int[][] graph;
    DijkstraAlgorithm(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    public int dijkstraAlgorithm(int[][] graph) {
        boolean[] visited = new boolean[V];
        int[] cost = new int[V];
        for(int i=0; i < V; i++) {
            visited[i] = false;
            cost[i] = Integer.MAX_VALUE;
        }
        cost[0] = graph[0][0];
        for(int i=0; i < V-1; i++) {
            int u = minCostVertex(cost, visited);
            visited[u] = true;
            for(int v=0; v < V; v++) {
                if(graph[u][v] != 0 && !visited[v] && graph[u][v] <= cost[v]) {
                    // cost[dest] = cost[source] + edge;    | Source - u
                    cost[v] = cost[u] + graph[u][v];
                }
            }
        }
        // Cost array for each vertex
        /*        for(int i=0; i < V; i++)
        //            System.out.print(cost[i] + " "); */
        int totalCost = 0;
        for(int i=0; i < V; i++)
            totalCost += cost[i];
        return totalCost;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        DijkstraAlgorithm algo = new DijkstraAlgorithm(V);
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                algo.graph[i][j] = sc.nextInt();
            }
        }
        int minCost = algo.dijkstraAlgorithm(algo.graph);
        System.out.println(minCost);
    }
}
