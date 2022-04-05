import java.util.Scanner;
public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("x값을 입력하세요");
        int x= scanner.nextInt();
        int y=(x*x-3*x+7);
        System.out.println("x="+x+" y="+y);



    }
}
