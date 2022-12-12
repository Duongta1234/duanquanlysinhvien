/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author duong
 */
public class Main {

    static int choose;

    static Scanner sc = new Scanner(System.in);
    static StudentService stdservice = new StudentService();

    public static void main(String[] args) {
        String input;

        while (true) {
            System.out.println("========Menu==========");
            System.out.println("======1.NHAP SINH VIÊN=======");
            System.out.println("======2.XUAT SINH VIÊN=======");
            System.out.println("======3.XOA SINH VIÊN=======");
            System.out.println("======4.SUA SINH VIÊN=======");
            System.out.println("=======5.SAP XEP SINH VIÊN=======");
            System.out.println("=======6.LOC SINH VIÊN=======");
            System.out.println("========7.THOÁT========");
            System.out.println("Moi ban chon");
            input = sc.nextLine();
            switch (Integer.parseInt(input)) {
                case 1:
                    stdservice.NhapSinhvien();
                    break;
                case 2:
                    stdservice.xuat();
                    break;
                case 3:
                    stdservice.xoaSinhvien();
                    break;
                case 4:
                    stdservice.suaSinhvien();
                    break;
                     case 5:
                    stdservice.xapxep();
                    break;
                     case 6:
                    stdservice.locSinhvien();
                    break;
                     case 7:
                         System.out.println("Bye");
                         System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }

}
