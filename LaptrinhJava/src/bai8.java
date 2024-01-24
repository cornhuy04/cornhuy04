import java.util.Scanner;
public class bai8 {
    private static void cau1() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap x: ");
            float x = scanner.nextFloat();
            System.out.print("Nhap y: ");
            float y = scanner.nextFloat();
            float S = (x+y)/(2+(x/y));
            System.out.printf("Gia tri cua S= (x+y)/(2+(x/y)) la: %.2f\n", +S);
        }
    }       
    private static void cau2(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            float a = scanner.nextFloat();
            System.out.print("Nhap b: ");
            float b = scanner.nextFloat();
            System.out.print("Nhap c: ");
            float c = scanner.nextFloat();
            System.out.print("Nhap r: ");
            float r = scanner.nextFloat();
            System.out.print("Nhap h: ");
            float h = scanner.nextFloat();
            float S = ((a+4)*(b-2*c+3))/(r/(2*h)-9*(a-1));
            System.out.printf("Gia tri cua S=((a+4)*(b-2*c+3))/(r/(2*h)-9*(a-1)) la: %.4f", +S);
        }
    } 
    private static void cau3(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap a: ");
            float a = scanner.nextFloat();
            System.out.print("Nhap x: ");
            float x = scanner.nextFloat();
            float S = (float) Math.sqrt(Math.abs(a + Math.pow((Math.sin(Math.toRadians(x))),2)-x));
            System.out.printf("Gia tri cua S la: %.5f", +S);
        }
    }
    public static void main(String[] args) {
        cau1();
        cau2();
        cau3();
    }
    }

    
