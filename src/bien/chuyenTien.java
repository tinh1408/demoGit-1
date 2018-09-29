package bien;

import java.util.Scanner;

public class chuyenTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so USD:");
        int USD = scanner.nextInt(); // em khai báo biến int cũng được tuy nhiên có thể khai báo biến float để phù hợp hơn ví dụ 20.5$
        int sotienVN =USD * 23000;
        System.out.println("tien USD:"+sotienVN);
    }
}
