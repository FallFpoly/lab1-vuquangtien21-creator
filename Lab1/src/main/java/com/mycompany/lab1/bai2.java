/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;
import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng
        System.out.print("nhap chieu dai: ");
        double dai = sc.nextDouble();

        System.out.print("nhap chieu rong: ");
        double rong = sc.nextDouble();

        // Tính chu vi
        double chuVi = (dai + rong) * 2;

        // Tính diện tích
        double dienTich = dai * rong;

        // Tìm cạnh nhỏ nhất
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        System.out.println("canh nho nhat: " + canhNhoNhat);
    }
}
