import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        System.out.printf("연산>> ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        String how = scanner.next();
        int second = scanner.nextInt();
        int temp=0;
        int result;
        if(how.equals("+"))
            result=first+second;
        else if(how.equals(("-")))
            result=first-second;
        else if(how.equals("*"))
            result=first*second;
        else {
            /*try{
                result = first/second;
            }catch (ArithmeticException e){
                System.out.println("0으로 나눌 수 없습니다.");
            }*/
            if(second==0){
                temp=1;
                System.out.println("0으로 나눌 수 없습니다.");
            }
            result=first/second;
        }

        if(temp==0) System.out.printf("%d %s %d의 결과는 %d",first,how,second,result);

        scanner.close();
    }
}