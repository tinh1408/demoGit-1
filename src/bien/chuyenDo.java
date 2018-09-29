package bien;

import java.util.Scanner;

public class chuyenDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao doF:");
        float F = scanner.nextInt(); // nếu anh nhập vào 12.5 thì chương trình của em sẽ lỗi vì ở đây em khai báo biến float nhưng lại sử dụng hàm nextInt
        float doC = 5* (F-32)/9;
        System.out.println("Do C la:" +doC);
        
        
    }
}
