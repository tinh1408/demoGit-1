package bien;

import java.util.Scanner;
public class diemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao diem toan:");
        float diemToan = scanner.nextInt(); // Lưu ý nhé: khai báo biến float thì phải sử dụng nextFloat
        System.out.println("nhap vao diem ly:");
        float diemLy = scanner.nextInt();  // tương tự
        System.out.println("nhap vao diem hoa:");
        float diemHoa = scanner.nextInt(); // tương tự

        if(((diemHoa >=0) && (diemHoa <=10))&&((diemLy >=0) && (diemLy <=10))&&((diemToan >=0) && (diemToan <=10))) {
            float diemTB = (diemHoa + diemLy + diemToan) / 3;
            System.out.println("nhap vao diem trung binh:" + diemTB);
            float tong = (diemHoa + diemLy + diemToan);
            System.out.println("nhap vao diem trung binh:" + tong);
        }else {
            System.out.println("loi");
        }
    }
}
