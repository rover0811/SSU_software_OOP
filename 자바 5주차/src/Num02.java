import java.util.Scanner;
public class Num02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("체중, 신장을 입력하세요");
        float W=scanner.nextFloat();
        float T= scanner.nextFloat();
        float BMI= W/T*T;
        System.out.printf("체중:%f",W);
        System.out.printf("키:%f",T);
        System.out.printf("BMI:%f",BMI);


        if(BMI>=30) System.out.println("비만도: 비만");
        else if(BMI>=25&&BMI<30) System.out.println("비만도: 과체중");
        else if(BMI>=18.5&&BMI<25) System.out.println("비만도: 정상");
        else System.out.println("그외");



    }
}
