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
        
        /* anh tinh gop y
        1. em nên khai báo biến trước khi sử dụng ví dụ
        int toan;
        toan = scanner.nextInt();
        2. biến toan,ly,hoa khai báo int thì chỉ nhập được số nguyên trong khi đó điểm có thể là 5.9 hoặc 7.8 (em xem lại kiểu dữ liệu cho phù hợp nhé)
       

    }
}
