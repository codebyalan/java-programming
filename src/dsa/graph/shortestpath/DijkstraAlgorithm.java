package dsa.graph.shortestpath;

import java.util.Arrays;

public class DijkstraAlgorithm {
    public static int findMinDistance(int[] dist, boolean[] visited, int vertices){
        int minIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < vertices; i++){
            if(!visited[i] && dist[i] <= minDistance){
                minDistance = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void dijkstra(int[][] graph, int src){
        int vertices = graph.length;
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < vertices - 1; count++){
            int u = findMinDistance(dist, visited, vertices);
            visited[u] = true;
            for(int v = 0;v<vertices;v++){
                if(!visited[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE & dist[u]+graph[u][v]<dist[v]){
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
    }
}
