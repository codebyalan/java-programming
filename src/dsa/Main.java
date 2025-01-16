package dsa;

import dsa.graph.list.AdjacencyList;
import dsa.graph.list.ListUndirected;

public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new ListUndirected(5);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,1);
        System.out.println(graph);
    }
}
