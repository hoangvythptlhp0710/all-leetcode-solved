package src.LythuyetDSA.thuVienSapXep;

import java.util.Arrays;
import java.util.Comparator;

public class sampleArraysSort {

    static class Student implements Comparable{
        int age;
        String name;
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
        @Override
        public int compareTo(Object o){
            // so sanh this / other
            Student otherStudent = (Student) o;
            // compareTo sẽ trả về 3 giá trị như sau
            /* 0 ? this = other
               1 ? this > other
               -1 ? this < other
             */
            if (this.age == otherStudent.age){
                return 0;
            }
            else if (this.age > otherStudent.age){
                return 1;
            }
                return -1;
        }
    }

    static class compareDependOnTheLengthOfTheName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            //0 o1 = o2
            // 1 o1 > o2
            //-1 o1 < o2
            if (o1.name.equals(o2.name)) {
                return 0;
            }
            return o1.name.compareTo(o2.name.toString());
        }
    }

    public static void main(String[] args) {


        // ========================== A. Using arrays.sort ===========================

        //#1. Sort an integer array
        int[] sampleArray = {3,2,1,0,4,5,76};
        Arrays.sort(sampleArray);
        System.out.println(Arrays.toString(sampleArray));

        //#2. Sort an String array
        String[] stringArray = {"1", "1234","00328","432"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        //#3. Sort a Student array with Comparable interface
        Student [] students  = {new Student("tester", 23), new Student("za", 29), new Student("kb", 39)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        //#4. Sort a Student array with Comparator
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name.toString());

            }
        });
        System.out.println(Arrays.toString(students));
    }


}
