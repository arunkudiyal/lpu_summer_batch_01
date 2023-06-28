package com.company;

import java.util.Scanner;

public class DFSGraph {
    int V;
    int[][] graph;
    DFSGraph(int V) {
        this.V = V;
        graph = new int[V][V];
    }
    void DFS(int start) {
        boolean[] visited = new boolean[V];
        for(int i=0; i < V; i++) visited[i] = false;
        DFSUtil(start, visited);
    }
    void DFSUtil(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for(int i=0; i < V; i++) {
            if(graph[start][i] == 1 && (!visited[i])) DFSUtil(i, visited);
        }
    }
/*
6
0 1 0 1 0 1
1 0 1 1 1 0
0 1 0 1 1 1
1 1 1 0 1 0
0 1 1 1 0 1
1 0 1 0 1 0
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        DFSGraph g = new DFSGraph(V);
        for(int i=0; i < V; i++) {
            for(int j=0; j < V; j++) {
                g.graph[i][j] = sc.nextInt();
            }
        }
        g.DFS(0);                                           // 0 1 2 3 4 5
    }
}
