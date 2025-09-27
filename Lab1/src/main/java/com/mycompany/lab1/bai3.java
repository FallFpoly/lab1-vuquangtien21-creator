/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;
/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap canh cua khoi lap phuong: ");
        double canh = scanner.nextDouble();

        double theTich1 = canh * canh * canh;

        double theTich2 = Math.pow(canh, 3);

        System.out.println("the tich (cach 1): " + theTich1);
        System.out.println("the tich(cach 2 - Math.pow): " + theTich2);
    }
}
