/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ho va ten: ");
        String hoTen = sc.nextLine();

        System.out.print("diem TB: ");
        double diemTB = sc.nextDouble();

        System.out.printf("%s %.2f diem\n", hoTen, diemTB);
    }
}
