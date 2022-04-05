import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        System.out.println("첫번째 정수를 입력하세요");
        Scanner scanner=new Scanner(System.in);
        int first= scanner.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int second= scanner.nextInt();
        int sum=first+second;
        System.out.println("두 정수의 합은 "+sum);
        scanner.close();
    }
}
