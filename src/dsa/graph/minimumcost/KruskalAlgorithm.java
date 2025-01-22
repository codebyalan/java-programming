package dsa.graph.minimumcost;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge implements Comparable<Edge>{
    int src, dest, weight;

    Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.dest;
    }
}

public class KruskalAlgorithm {

    int V, E;
    List<Edge> edges = new ArrayList();
    KruskalAlgorithm(int e, int v){
        this.V = v;
        this.E = e;
    }

    void addEdge(int src, int dest, int weight){
        edges.add(new Edge(src,dest,weight));
    }

    int find(int[] parent, int i) {
        if(parent[i]!=i){
            parent[i] = find(parent, parent[i]);
        }
        return parent[i];
    }

    void union(int[] parent, int[] rank, int x, int y){
        int rootX = find(parent,x);
        int rootY = find(parent,y);
        if(rank[rootX] < rank[rootY]){
            parent[rootX] =rootY;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootY] = rootX;
        }else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    void kruskalMST(){
        List<Edge> result = new ArrayList();
        Collections.sort(edges);

        int[] parent = new int[V];
        int[] rank = new int[V];

        for(int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int e = 0;
        for(Edge edge: edges){
            if(e == V-1){
                break;
            }
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);

            if(x!=y){
                result.add(edge);
                union(parent,rank,x,y);
                e++;
            }

        }

        System.out.println("Edges in the MST:");
        for (Edge edge : result) {
            System.out.println(edge.src + " - " + edge.dest + ": " + edge.weight);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        KruskalAlgorithm graph = new KruskalAlgorithm(V, E);

        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        graph.kruskalMST();
    }
}
