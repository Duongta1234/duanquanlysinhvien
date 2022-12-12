/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author duong
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    static Scanner sc = new Scanner(System.in);
    static List<Student> lst = new ArrayList<>();
    Student st;

    void NhapSinhvien() {
        while (true) {
            st = new Student();
            System.out.println("Moi bạn nhập id sinh viên: ");
            st.setId(sc.nextLine());
            System.out.println("Mời bạn nhập tên sinh viên");
            st.setTen(sc.nextLine());
            System.out.println("Mời bạn nhập năm sinh");
            st.setNamsinh(Integer.parseInt(sc.nextLine()));
            System.out.println("Mời bạn nhập dia chi sinh viên");
            st.setDiachi(sc.nextLine());
            System.out.println("Mời bạn nhập số điện thoại");
            st.setSodienthoai(sc.nextLine());
            lst.add(st);
            String choosen;
            System.out.println("Bạn muốn nhập tiếp hay không ?");
            choosen = sc.nextLine();
            if (choosen.equalsIgnoreCase("khong")) {
                break;
            }
        }

    }

    void xuat() {
        if (lst.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            for (Student student : lst) {
                student.show();
            }
        }
    }

    void timKiemtheoID() {
        if (lst.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            System.out.println("Moi ban nhap id can tim");
            String idFind;
            idFind = sc.nextLine();
            for (int i = 0; i < lst.size(); i++) {
                if (idFind.equalsIgnoreCase(lst.get(i).getId())) {
                    lst.get(i).show();
                }
            }
        }
    }

    void xoaSinhvien() {
        if (lst.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            System.out.println("Moi ban nhap id can tim");
            String idFind;
            idFind = sc.nextLine();
            for (int i = 0; i < lst.size(); i++) {
                if (idFind.equalsIgnoreCase(lst.get(i).getId())) {
                    lst.remove(i);
                }
            }
        }
    }

    void suaSinhvien() {
        if (lst.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            System.out.println("Moi ban nhap id can tim");
            String idFind;
            idFind = sc.nextLine();
            for (int i = 0; i < lst.size(); i++) {
                if (idFind.equalsIgnoreCase(lst.get(i).getId())) {
                    System.out.println("Bạn muốn sửa gì");
                    System.out.println("1.SỬA SỐ ĐIỆN THOẠI");
                    System.out.println("2.Sửa địa chỉ");
                    System.out.println("3.SỬA NĂM SINH");
                    int choose;
                    choose = sc.nextInt();
                    switch (choose) {
                        case 1:
                            System.out.println("Moi ban nhập số điện thoại muốn sửa");
                            lst.get(i).setSodienthoai(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Moi ban nhập địa chỉ muốn sửa");
                            lst.get(i).setDiachi(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("Moi ban nhập năm sinh muốn sửa");
                            lst.get(i).setNamsinh(Integer.parseInt(sc.nextLine()));
                            break;
                        default:
                            System.out.println("ko tồn tại chức năng này");

                    }
                }
            }
        }
    }
    void locSinhvien(){
          if (lst.isEmpty()) {
            System.out.println("Danh sách đang rỗng");
        } else {
            System.out.println("Moi ban nhap ten can tim");
            String tentimkiem;
            tentimkiem = sc.nextLine();
            for (int i = 0; i < lst.size(); i++) {
                if(tentimkiem.contains(lst.get(i).getTen())){
                    lst.get(i).show();
                }
            }
        }
    }
    void xapxep() {
        lst.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
    }
}
