import java.util.Scanner;
public class bai9 {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Duong thang D: Ax+By+C=0\n");
            System.out.print("Nhap A: ");
            double a = scanner.nextFloat();
            System.out.print("Nhap B: ");
            double b = scanner.nextFloat();
            System.out.print("Nhap C: ");
            double c = scanner.nextFloat();
            System.out.print("Diem I(x,y)\n");
            System.out.print("Nhap x: ");
            double x = scanner.nextFloat();
            System.out.print("Nhap y: ");
            double y = scanner.nextFloat();
            double S = (a*x+b*y+c)/(Math.sqrt(a*a+b*b));
            System.out.printf("Khoang cach tu I toi duong thang D la: %.2f ",(float)+S);
        }
    }

}
