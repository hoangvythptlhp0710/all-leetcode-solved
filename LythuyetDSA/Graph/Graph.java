package src.LythuyetDSA.Graph;

import java.util.*;

public class Graph {

    private static int v;
    private static LinkedList<Integer> adjLists[];
    private static boolean[] visited;

    Graph(int vertices){
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++){
            adjLists[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int src, int dest){
        adjLists[src].add(dest);
    }

    void DFSImpl(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFSImpl(adj);
        }
    }

    void BFSImpl(int s){
        boolean[] hasVisited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0){
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adjLists[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!hasVisited[n]){
                    hasVisited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        System.out.println("DFS Traversal of this graph: ");
        graph.DFSImpl(1);
    }
}
