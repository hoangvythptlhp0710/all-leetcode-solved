import java.util.Scanner;

public class Ex1 {
    
    public static String hhName(String[] name, int[] mark, int m){
        




        return name.toString();
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students in class: ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] mark = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter the name of student" + (i + 1)+ ": ");
            name[i] = sc.next();
            System.out.println("Enter mark: ");
            mark[i] = sc.nextInt();
        }
        System.out.println("List of " + n + " students: ");
        System.out.println("Name" + " - " + " Mark");
        for (int i = 0; i < n; i++){
            System.out.println(name[i] + " - " + mark[i]);
        }
        System.out.println("Enter the number m: ");
        int m = sc.nextInt();
        System.out.println(m + " students that have highest score: ");
        System.out.println(hhName(name, mark, m));
    }
}
