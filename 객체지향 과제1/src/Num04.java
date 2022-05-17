import java.util.Arrays;
import java.util.Scanner;
public class Num04 {
    public static void main(String[] args) {
        //중간값 출력
        Scanner scanner=new Scanner(System.in);
        int intarray[];
        intarray=new int[3];
        System.out.println("정수 3개 입력");

        for(int i=0;i<intarray.length;i++){
            intarray[i]= scanner.nextInt();
        }
        Arrays.sort(intarray);

        System.out.println("중간 값은 "+intarray[1]);

    }
}