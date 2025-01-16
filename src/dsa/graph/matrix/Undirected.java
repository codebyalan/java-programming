package dsa.graph.matrix;

public class Undirected implements AdjacencyMatrix{

    public int v;
    public int e;
    int[][] adjMatrix;

    public Undirected(int nodes){
        v = nodes;
        adjMatrix = new int[nodes][nodes];
    }

    @Override
    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        e++;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append(v+" vertices, "+e+" edges \n");
        for (int i=0;i<v;i++){
            sb.append(i + " ");
            for (int w: adjMatrix[i]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
