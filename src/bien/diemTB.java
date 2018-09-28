package bien;

import java.util.Scanner;
public class diemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao diem toan:");
        float diemToan = scanner.nextInt();
        System.out.println("nhap vao diem ly:");
        float diemLy = scanner.nextInt();
        System.out.println("nhap vao diem hoa:");
        float diemHoa = scanner.nextInt();
        float diemTB =(diemHoa + diemLy + diemToan)/3;
        System.out.println("nhap vao diem trung binh:" + diemTB);
        float tong =(diemHoa + diemLy + diemToan);
        System.out.println("nhap vao diem trung binh:" + tong);
    }
}