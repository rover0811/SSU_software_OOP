import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffee;
        int sort, price = 0;
        System.out.print("커피의 종류와 개수를 입력하세요>> ");
        coffee = scanner.next();
        sort = scanner.nextInt();
        switch (coffee) {
            case "에스프레소":
                price = 2000;
                break;
            case "아메리카노":
                price = 2500;
                break;
            case "카푸치노":
                price = 3000;
                break;
            case "카페라떼":
                price = 3500;
                break;
        }
        System.out.println(price*sort+"원 입니다");

    }
}
