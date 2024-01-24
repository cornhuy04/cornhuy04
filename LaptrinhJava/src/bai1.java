import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhap chieu dai: ");
			float a = sc.nextFloat();
			System.out.printf("Nhap chieu rong: ");
			float b = sc.nextFloat();
			float c = (float) Math.sqrt(a*a+b*b);
			float d = a*b;
			float e = (a+b)*2;
			System.out.printf("Chu vi hinh chu nhat la: %.1f\n", +e);
			System.out.printf("Dien tich hinh chu nhat la: %.1f\n", +d);
			System.out.printf("Duong cheo hinh chu nhat la: %f", +c);
		}
	

	}
}
