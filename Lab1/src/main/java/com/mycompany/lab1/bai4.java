/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Delta = " + delta);

        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Can delta = " + canDelta);
        } else {
            System.out.println("Delta < 0, khong co can bac 2 thuc.");
        }
    }
}
