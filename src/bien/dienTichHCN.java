package bien;

import java.util.Scanner;

public class dienTichHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu dai:");
        float chieudai = scanner.nextInt();
        System.out.println("nhap vao chieu rong:");
        float chieurong = scanner.nextInt();
        float dienTich = chieudai * chieurong ;
        System.out.println("dien tich:" +dienTich);
    }
}
