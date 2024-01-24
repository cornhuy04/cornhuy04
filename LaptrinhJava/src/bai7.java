import java.util.Scanner;
public class bai7 {
//a
    public static void trunggian(float x, float y) {   
       float swap = x;
             x = y;
             y = swap;
       System.out.printf("Hoan doi trung gian: \n");
       System.out.printf("a= %f\n", +x);
       System.out.printf("b= %f\n", +y);
    }
//b
public static void kotrunggian(float x, float y) {
     x = x - y;
     y = x + y;
     x = y - x;
    System.out.printf("Hoan doi khong trung gian: \n");
    System.out.printf("a= %f\n", +x);
    System.out.printf("b= %f\n", +y);
}
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so a: ");
               float a = scanner.nextFloat();
               System.out.print("Nhap so b: ");
               float b = scanner.nextFloat();
               trunggian(a,b);
               kotrunggian(a,b);
        }
}
}
    
