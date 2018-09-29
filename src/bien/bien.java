package bien;

public class bien {
    public static void main(String[] args) {
        //Biến i kiểu số nguyên, có giá trị là 10
        //Biến f kiểu số thực, có giá trị là 20.5
        //Biến d kiểu số thực lớn, có giá trị là 20.5
        //Biến b kiểu logic, có giá trị là true
        //Biến c kiểu ký tự, có giá trị là 'a'
        //Biến s kiểu chuỗi, có giá trị là "Hà Nội".
        int i = 10;
        float f = (float) 20.5; // ở đây biến f đã là kiểu float nên em ko cần ép về kiểu float nữa mà khai báo như sau: float f = 20.5f;
        double d = 20.5;
        boolean b = true;
        char c ='a';
        String s = " Hà Nội";
        System.out.println("kieu so nguyen:" +i);
        System.out.println("kieu so thuc:" +f);
        System.out.println("kieu so thuc lon:" +d);
        System.out.println("kieu logic:" +b);
        System.out.println("kieu ky tu:" +c);
        System.out.println("kieu chuoi:" +s);
        
        // Lưu ý đặt tên biến phải tường minh nhé, ví dụ String s = "Hà Nội" thì đặt lại là String thanhPho = "Hà Nội";

    }
}
