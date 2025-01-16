package dsa.graph.list;

import java.util.LinkedList;
import java.util.List;

public class ListUndirected implements AdjacencyList{

    int v;
    int e;
    List<Integer>[] list;

    public ListUndirected(int nodes){
        this.v=nodes;
        this.e=0;
        this.list = new LinkedList[nodes];
        for (int i=0;i<nodes; i++){
            list[i] = new LinkedList<>();
        }
    }

    @Override
    public void addEdge(int u, int v) {
        list[u].add(v);
        list[v].add(u);
        e++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(e + "edges, "+v+" vertices\n");
        for (int i = 0; i<e; i++){
            sb.append(i);
            for (int w: list[i]){
                sb.append(" "+w);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
