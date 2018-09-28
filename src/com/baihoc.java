package com;

import java.util.Scanner;

public class baihoc {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao diem toan:");
        int toan = scanner.nextInt();
        System.out.println(" nhap vao diem ly:");
        int ly = scanner.nextInt();
        System.out.println(" nhap vao diem hoa:");
        int hoa = scanner.nextInt();
        int tong = toan + ly + hoa;
        System.out.println(" tong diem:"+tong);

    }
}
