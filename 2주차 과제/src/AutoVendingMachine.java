import java.util.Scanner;
public class AutoVendingMachine {
    public static void main(String[] args) {
        System.out.println("투입:");
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();
        System.out.println("물건값");
        int price= scanner.nextInt();
        int charge=input-price;
        int half=charge/500;
        int newcharge=charge-half*500;

        System.out.println("두 정수의 합은 "+sum);
        scanner.close();
    }
}
