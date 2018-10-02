package bien;

import java.util.Scanner;

public class hinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ban kinh:");
        float bankinh = scanner.nextFloat();
        double CV = bankinh * 2 * 3.14;// 3.14 được sử dụng lại 2 lần và đây là số không thay đổi nên em set cho nó là hằng số em nha: Ví dụ: final int PI = 3.14;
        System.out.println("chu vi hinh tron :" + CV);
        double DT = bankinh* bankinh *3.14;
        System.out.println("chu vi hinh tron :" + DT);
    }
}
