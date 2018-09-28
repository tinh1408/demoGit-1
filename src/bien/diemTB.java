package bien;

import java.util.Scanner;
public class diemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao diem toan:");
        int diemToan = scanner.nextInt();
        System.out.println("nhap vao diem ly:");
        int diemLy = scanner.nextInt();
        System.out.println("nhap vao diem hoa:");
        int diemHoa = scanner.nextInt();
        int diemTB =(diemHoa + diemLy + diemToan)/3;
        System.out.println("nhap vao diem trung binh:" + diemTB);
        int tong =(diemHoa + diemLy + diemToan);
        System.out.println("nhap vao diem trung binh:" + tong);
    }
}