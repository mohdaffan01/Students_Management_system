package com.studentmanagement;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    int n;
    ArrayList<student> students = new ArrayList<>();

    //-------------------for add the students to list----------------
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " Info:");
            student objStudent = new student();
            objStudent.inputName();
            objStudent.inputRollNo();
            objStudent.inputClassName();
            objStudent.inputMarks();
            students.add(objStudent);
        }
    }

    //---------------to view the list---------------
    void view() {
        for (int i = 0; i < n; i++) {
            students.get(i).display();
        }
    }

    // --------------------for update ----------
    void update() {
        System.out.println("Enter the student roll no. to update:");
        Scanner sc = new Scanner(System.in);
        int targetUpdate = sc.nextInt();
        sc.nextLine(); // Clear the buffer after reading int

        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == targetUpdate) {
                found = true;
                System.out.println("Student found. Enter the new details:");

                System.out.println("Enter new name:");
                String newName = sc.nextLine();
                students.get(i).name = newName;

                System.out.println("Enter new class name:");
                String newClassName = sc.nextLine();
                students.get(i).className= newClassName;

                System.out.println("Enter new marks:");
                int newMarks = sc.nextInt();
                students.get(i).marks = newMarks;
//                sc.nextLine();

                System.out.println("Student info updated successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Student with roll number " + targetUpdate + " not found.");
        }
    }


    //---------------for delete the student ----------------
    void delete() {
        System.out.println("Enter the student roll no to delete :");
        Scanner sc = new Scanner(System.in);
        int targetRollno = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == targetRollno) {
                students.remove(i);
                n--;
            }
        }
    }

    //------------------add info in file-------------------------
    void saveAllStudents() {
        try {
            FileWriter writer = new FileWriter("studentsInformation.txt");

            for (student student : students) {
                writer.write("Name: " + student.name + ", Roll No: " + student.rollNo + ", Class: " + student.className + ", Marks: " + student.marks + "\n");
            }

            writer.close();
            System.out.println("All students' data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error while saving students' information:");
            e.printStackTrace();
        }
    }


    //----------------exit from the program-----------------
    void exit() {
        System.out.println("exit from a program !");
        System.exit(0);
    }
}
