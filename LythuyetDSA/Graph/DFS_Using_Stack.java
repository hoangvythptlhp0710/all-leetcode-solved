package src.LythuyetDSA.Graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS_Using_Stack {

    public static void main(String[] args) {

        int[][] graph = {       {0, 1, 0, 0, 0 ,0, 0},
                                {1, 0, 1, 1, 1, 0, 0},
                                {0, 1, 0, 0, 0, 1, 0},
                                {0, 1, 0, 0, 0, 1, 1},
                                {0, 1, 0, 0, 0, 0, 1},
                                {0, 0, 1, 1, 0, 0, 0},
                                {0, 0, 0, 1, 1, 0, 0},   };

        //Khai báo stack
        Stack<Integer> stack = new Stack<>();
        Set<Integer> daDuyet = new HashSet<>();

        //Khoi tao
        stack.add(0);
        daDuyet.add(0);

        //Duyet theo stack
        while(!stack.isEmpty()){
            int u = stack.pop();
            //process u
            System.out.print(u + " ");
            //add tất cả các đỉnh kề v với u mà chưa được duyệt vao stack

            for (int v = 0; v < graph.length; v++){
                if (graph[u][v] == 1 && !daDuyet.contains(v)){
                    stack.add(v);
                    daDuyet.add(v);
                }
            }
        }
    }
}
