package src.LythuyetDSA.Graph;

import java.util.HashSet;
import java.util.Set;

public class setup_dijkstra_algo {

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = {{0,6,0,1,0},{6,0,5,2,2},{0,5,0,0,5},{1,2,0,0,1},{1,2,5,1,0}};
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n];// khoảng cách từ đỉnh đầu đến i
        int[] previous = new int[n];// là đỉnh ngay phía trước của i

        int start = 0;
        int finish = 4;
        int oo = Integer.MAX_VALUE;

        //b1: Khởi tạo khoảng cách
        for (int i = 0; i < n; i++){
            distance[i] = oo;
        }
        distance[start] = 0;
        while(visited.size() < n){

            //b2: chọn đỉnh chưa duyệt và đang có khoảng cách nhỏ nhất (từ đỉnh xuất phát) làm đỉnh dang xét
            int dangXet = 0;
            int minDist = oo;
            for (int i = 0; i < n; i++){
                if (visited.contains(i) == false && distance[i] < minDist){
                    minDist = distance[i];
                    dangXet = i;
                }
            }
            //b3: từ đỉnh đang xét, duyệt các ĐỈNH KỀ chưa duyệt, update khoảng cách và đỉnh trước của các đỉnh đó
            for (int i = 0; i < n; i++) {
                if (visited.contains(i) == false && arr[dangXet][i] != 0) {
                    int newDist = distance[dangXet] + arr[dangXet][i];
                    if (newDist < distance[i]) {
                        distance[i] = newDist;
                        previous[i] = dangXet;
                    }
                }
            }
            visited.add(dangXet);
        }
        System.out.println("Khoảng cách nhỏ nhất từ " + start + " đến 3 là " + distance[3]);
    }
}
