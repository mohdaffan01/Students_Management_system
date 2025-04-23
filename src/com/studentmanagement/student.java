package com.studentmanagement;


import java.util.Scanner;

public class student {
    String name;
    int rollNo;
    String className;
    int marks;

    Scanner sc = new Scanner(System.in);
    void inputName() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    void inputRollNo() {
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    void inputClassName() {
        System.out.print("Enter class name: ");
        className = sc.nextLine();
    }

    void inputMarks() {
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Class: " + className + ", Marks: " + marks);

    }
}
