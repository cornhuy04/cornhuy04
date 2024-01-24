import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so thuc x(x>0): ");
            float x = scanner.nextFloat();
            System.out.print("Nhap so thuc n: ");
            float n = scanner.nextFloat();
            float A = (float) Math.pow(x, 1/n);
            System.out.printf("Gia tri cua A = x^1/n la: %.5f", +A);
        }
    }
}
