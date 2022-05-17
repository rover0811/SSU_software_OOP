import java.util.Scanner;
public class Num12_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("연산>>");
        float firstNum= scanner.nextFloat();
        String operator = scanner.next();
        float secNum= scanner.nextFloat();
        float result=0;
        switch(operator){
            case ("+"):
                result=firstNum+secNum;
            break;
            case ("-"):
                result=firstNum-secNum;
                break;
            case ("*"):
                result=firstNum*secNum;
                break;
            case ("/"):
                if(secNum==0) {System.out.println("0으로 나눌 수 없습니다");break;}
                result=firstNum/secNum;
                break;
        }

        if(secNum!=0)System.out.println(firstNum+operator+secNum+"의 계산결과는 "+result);

    }
}
