/*
*@author mohd affan
*THIS PROGRAM TO MANAGE THE STUDENT INFORMATION --> NAME , ROLL NO, CLASS NAME , MARKS.
* ADD, VIEW , UPDATE, DLETE , EXIT
 */
package com.studentmanagement;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        student objStudent = new student();
        StudentManager objManager = new StudentManager();

       while (true) {
           Scanner scan = new Scanner(System.in);
           System.out.println();
           System.out.println("1 --> for add.");
           System.out.println("2 -->for view.");
           System.out.println("3 --> for update.");
           System.out.println("4 --> for delete.");
           System.out.println("5 --> for save in file.");
           System.out.println("6 --> for exit.");

           System.out.print("Enter your choice : ");

           int choice = scan.nextInt();

           switch (choice) {
               case 1:
                   objManager.add();
                   break;
               case 2:
                   objManager.view();
                   break;
               case 3:
                   objManager.update();
                   break;
               case 4:
                   objManager.delete();
                   break;
               case 5:
                   objManager.saveAllStudents();
                   break;
               case 6:
                   objManager.exit();
                   break;


               default:
                   System.err.println("invalid choice");
           }


       }
    }
}
