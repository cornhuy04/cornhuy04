import java.util.Scanner;    
public class bai2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap ban kinh duong tron: ");
            float a = scanner.nextFloat();
            float b = (float) Math.PI*2*a;
            float c = (float) Math.PI*a*a;
            System.out.printf("Chu vi duong tron la: %f\n", +b);
            System.out.printf("Dien tich duong tron la: %f", +c);
        }
    }
 
}
