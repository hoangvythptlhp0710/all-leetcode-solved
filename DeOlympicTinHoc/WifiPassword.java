package src.DeOlympicTinHoc;

import java.util.*;

/*
Trong khuôn viên trường đại học PTU, nếu bạn muốn dùng Wifi, bạn chỉ có cách duy nhất là
tìm lời giải của một bài toán do chính thầy hiệu trưởng thách đố. Đề bài được dán công khai trên bảng tin,
thay đôi trong từng khung giờ. Đáp ản của bài toàn chính là mật khẩu Wifi. Bài toán cụ thể như sau:
    Cho số nguyên dương N, hãy tìm hai số nguyên dương X, Y (X<=Y) sao cho tổng X và Y đạt max
    và X, Y thỏa mãn phương trình sau:
                        X x Y + X + Y = N^2
    Dữ liệu đầu vào: Vào đề với định dạng như sau:
            - Dòng đầu ghi số nguyên dương Q là số lượng câu hỏi
            - Q dòng tiếp theo, mỗi dòng chứa một số nguyên dương N (N <= 10^6)
    Kết quả: Ghi ra Q dòng, mỗi dòng ghi một cuỗi là ghép của hai số X và Y (X <= Y) thỏa mãn yêu cầu đề bài
             và là kết quả của câu hỏi tương ứng.

 */
public class WifiPassword {

    public static String handleMethod(int n){
        StringBuilder sb = new StringBuilder();
        int x = 1, y = 1;
        int pow, ques;
        while (x < n){
            while (y < n){
                pow = (int) Math.pow(n, 2);
                ques = x * y + x + y;
                if (pow == ques){
                    sb.append(x);
                    sb.append(y);
                }
                else{
                    x++;
                }
                y++;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int inp = sc.nextInt();
            System.out.println(handleMethod((int) Math.pow(inp,2)));
        }
    }
}
