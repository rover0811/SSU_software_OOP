import java.util.Scanner;
public class Num01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int math= scanner.nextInt();
        int eng= scanner.nextInt();
        if(math>=90&&eng>=90) System.out.println("전액 장학금");
        else if(math>=90||eng>=90) System.out.println("반액 장학금");
        else System.out.println("다음 기회에");
    }
}
