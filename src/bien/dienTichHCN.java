package bien;

import java.util.Scanner;

public class dienTichHCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chieu dai:");
        float chieudai = scanner.nextFloat();
        System.out.println("nhap vao chieu rong:");
        float chieurong = scanner.nextFloat();
        float dienTich = chieudai * chieurong ; // Biến chiều dài và chiều rộng em nên đặt là : chieuDai, chieuRong để theo đúng quy tắc em nha
        System.out.println("dien tich:" +dienTich);
    }
}
