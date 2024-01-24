import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap a: ");
            float a = scanner.nextFloat();
            System.out.print("Nhap x: ");
            float x = scanner.nextFloat();
            float S = (float) Math.pow(Math.E, a + Math.pow((Math.sin(Math.toRadians(x))),2)-x);
            System.out.printf("Gia tri cua S = e^(a+sin(x)^2-x)la: %f", +S);
        scanner.close();
    }
}
