package bien;

import java.util.Scanner;

public class hinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ban kinh:");
        int bankinh = scanner.nextInt();
        double CV = bankinh * 2 * 3.14; // 3.14 được sử dụng lại nhiều lần nên trường hợp này em nên khai báo hằng số cho 3.14 ví dụ: final int PI = 3.14;
        System.out.println("chu vi hinh tron :" + CV);
        double DT = bankinh* bankinh *3.14; // 3.14 được sử dụng lại nhiều lần nên trường hợp này em nên khai báo hằng số cho 3.14 ví dụ: final int PI = 3.14;
        System.out.println("chu vi hinh tron :" + DT);
    }
}
