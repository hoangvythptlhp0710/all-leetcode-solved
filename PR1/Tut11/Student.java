package Tut11;

import java.util.*;

public class Student {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        Map<String, List<String>> list = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        list1.add("Viet Hoa");
        list1.add("Quoc Thinh");
        list2.add("Hong Ngoc");
        list3.add("Hoang Hiep");

        list.put("a1",list1);
        list.put("a2",list2);
        list.put("a3",list3);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println("Welcome to the menu-driven program!");

        while (true){
            System.out.println();
            System.out.println("1. Add a student to a class");
            System.out.println("2. Display all students in a class");
            System.out.println("3. Exit");


            System.out.println("Choose option: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter class's name: ");
                    String className = sc.next();
                    if (list.containsKey(className)){
                        System.out.print("Enter student's name: ");
                        String studentName = sc.next();
                        if (className == "a1"){
                            list1.add(studentName);
                        }
                        else if (className == "a2"){
                            list2.add(studentName);
                        }
                        else if (className == "a3"){
                            list3.add(studentName);
                        }
                    }
                    else{
                        System.out.println("Class not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter the class's name: ");
                    String d = sc.next();
                    if (list.containsKey(d)){
                        System.out.println(list.get(d));
                    }
                    else{
                        System.out.println("Class not found");
                }
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid value!!! Please try again");
            }
        }
    }
}
