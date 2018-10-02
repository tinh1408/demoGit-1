package bien;

import java.util.Scanner;

public class tuoiNguoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao nam sinh:");
        int namsinh = scanner.nextInt();
        int tuoi = 2018 - namsinh; // Năm sinh em cho nhập vào ví dụ như sang năm 2019 thì chương trình của em chạy không đúng nữa
        System.out.println("tuoi cua mot nguoi:" + tuoi);
    }
}
