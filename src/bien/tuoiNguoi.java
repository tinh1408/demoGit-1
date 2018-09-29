package bien;

import java.util.Scanner;

public class tuoiNguoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao nam sinh:");
        int namsinh = scanner.nextInt();
        int tuoi = 2018 - namsinh;  // chương trình của em chỉ chạy đúng trong năm 2018 vậy giả sử qua năm 2019 hoặc 2020 anh phải sửa lại chương trình đúng không ? Vậy phải làm thế nào nhỉ ? em suy nghĩ cách làm thử nha
        System.out.println("tuoi cua mot nguoi:" + tuoi);
    }
}
