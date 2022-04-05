
import java.util.Scanner;
public class Practice04 {
    public static void main(String[] args) {
        {
            {
            Scanner scanner = new Scanner(System.in);
            String coffee;
            int sort, price = 0;
            System.out.print("커피의 종류와 개수를 입력하세요>> ");
            coffee = scanner.next();
            sort = scanner.nextInt();

            if ("에스프레소".equals(coffee)) {
                price = 2000;

            } else if ("아메리카노".equals(coffee)) {
                price = 2500;
            } else if ("카푸치노".equals(coffee)) {
                price = 3000;
            } else if ("카페라떼".equals(coffee)) {
                price = 3500;
            }
            System.out.println(price*sort+"원 입니다");
        }


    }
}}


