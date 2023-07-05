package com.company;

import java.util.Scanner;

public class BellmanFordAlgorithm {
    int V;
    int[][] graph;
    int[] cost;
    BellmanFordAlgorithm(int V) {
        this.V = V;
        graph = new int[V][V];
        cost = new int[V];
        for(int i=0; i < V; i++)
            cost[i] = Integer.MAX_VALUE;
    }
    public int bellmanFord(int source, int destination) {
        cost[source] = graph[source][source];
        // repeatedly relax the vertices from the edge source to the destination
        for(int i=0; i < V-1; i++) {
            for(int u=0; u < V; u++) {
                for(int v=0; v < V; v++) {
                    // If there is a path between source & the vertex
                    if(graph[u][v] != 0)  {
                        // relaxation algorithm -
                        if(cost[v] > cost[u] + graph[u][v])
                            cost[v] = cost[u] + graph[u][v];
                    }
                }
            }
        }
        // After relaxation print the cost of each vertex from the source
        for(int i=0; i < V; i++)
            System.out.print(cost[i] + " ");
        System.out.println();
        return cost[destination];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        BellmanFordAlgorithm bfa = new BellmanFordAlgorithm(V);
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                bfa.graph[i][j] = sc.nextInt();
            }
        }
        int source = sc.nextInt();
        int dest = sc.nextInt();
        int res = bfa.bellmanFord(source, dest);
        System.out.println(res);
    }
}
