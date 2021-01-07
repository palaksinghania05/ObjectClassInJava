package main;
import databean.Student;
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(11);
        s1.setName("Prakhar");
        Student s2 = new Student();
        s2.setName("Prakhar");
        s2.setRollNo(11);
        //checking a String
        String str = "abc";

        //Are s1 and s2 equal ?
        System.out.println("s1 equals s2 => " + s1.equals(s2));
    }
}
