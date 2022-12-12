/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author duong
 */
public class Student {
  private String id ;
  private String ten ; 
  private String diachi ;
  private int namsinh ;
  private String sodienthoai;

    public Student() {
    }

    public Student(String id, String ten, String diachi, int namsinh, String sodienthoai) {
        this.id = id;
        this.ten = ten;
        this.diachi = diachi;
        this.namsinh = namsinh;
        this.sodienthoai = sodienthoai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public void show(){
        System.out.printf("id: %s | Name: %s | quequan : %s | namsinh: %d |Tuoi: %d",id,ten,diachi,namsinh,2022-namsinh);
    }
}
