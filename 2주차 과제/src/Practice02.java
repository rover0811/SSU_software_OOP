import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int height=5;
        System.out.println("건물 층수를 입력하세요");
        int buildingheight= scanner.nextInt();
        System.out.println("건물의 높이는 "+buildingheight*height+"m입니다");
        scanner.close();
    }
}
