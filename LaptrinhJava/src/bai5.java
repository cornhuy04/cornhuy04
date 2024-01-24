import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap V(m/s): ");
            float V = scanner.nextFloat();
            System.out.print("Nhap T(s): ");    
            float T = scanner.nextFloat();
            float S = V*T;
            float H = (float) (9.8*T*T)/2;
            System.out.printf("Gia tri cua S = V*T la: %.2f (m)\n", +S);    
            System.out.printf("Gia tri cua H = (9.8*T*T)/2 la: %.2f (m)", +H);
        }
    }
    
}
