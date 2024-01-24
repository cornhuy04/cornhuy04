import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so thuc x: ");
            float x = scanner.nextFloat();
            System.out.print("Nhap so thuc y: 4");
            float y = scanner.nextFloat();
            float z = (float)Math.pow(x, y);
            System.out.printf("Gia tri S=x^y la: %.3f", +z);
        }
    
    }
}