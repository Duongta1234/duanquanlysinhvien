/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author duong
 */
public class SinhVienCaoDangFpt extends Student{
    private String nghanhhoc;

    public SinhVienCaoDangFpt() {
    }

    public SinhVienCaoDangFpt(String id, String ten, String diachi, int namsinh, String sodienthoai) {
        super(id, ten, diachi, namsinh, sodienthoai);
    }

    public String getNghanhhoc() {
        return nghanhhoc;
    }

    public void setNghanhhoc(String nghanhhoc) {
        this.nghanhhoc = nghanhhoc;
    }
    void inramanhinh(){
         
        System.out.printf("id: %d | Name: %s | nghanh hoc: %s | quequan : %s | namsinh: %d |Tuoi: %d",getId(),getTen(),nghanhhoc,getDiachi(),getNamsinh(),2022-getNamsinh());
    
    }
}
