package Graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS_Using_Queue {
    public static void main(String[] args) {

        int[][] graph = {{0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0},};

        //Khai báo
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> daDuyet = new HashSet<>();

        //Duyệt theo queue
        queue.add(0);
        daDuyet.add(0);

        //Process u
        while (!queue.isEmpty()) {
            int u = queue.remove();

            System.out.print(u + " ");
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && !daDuyet.contains(v)) {
                    queue.add(v);
                    daDuyet.add(v);
                }
            }
        }
    }
}

