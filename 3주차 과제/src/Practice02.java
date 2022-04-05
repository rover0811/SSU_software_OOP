import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {
        System.out.println("돈의 액수를 입력하세요.>>");
        Scanner scanner=new Scanner(System.in);
        int money= scanner.nextInt();
        System.out.println("5만원권: "+money/50000);
        int temp=money-50000*(money/50000);
        System.out.println("1만원권: "+temp/10000);
        temp=temp-10000*(temp/10000);

        System.out.println("1천원권: "+temp/1000);
        temp=temp-1000*(temp/1000);

        System.out.println("5백원권: "+temp/500);
        temp=temp-500*(temp/500);

        System.out.println("1백원권: "+temp/100);
        temp=temp-100*(temp/100);

        System.out.println("10원권: "+temp/10);
        temp=temp-10*(temp/10);

        System.out.println("1원권: "+temp);





    }
}
