/*import java.util.Scanner;

public class P7{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나뉨수를 입력하시오:");;
        int dividend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오:");;
        int divisor = scanner.nextInt();
        try {
            System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다");
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }
}*/
public class P7 {

    public static void main(String[] args)
    {
        byte[] b = new byte[2];
        int[] i = new int[2];
        float[] f = new float[2];//0.0
        Object[] o = new Object[2];//null값이 나오네;;

        System.out.println(b[1]+","+i[1]+","+f[1]+","+o[1]);
    }
}
//동적 할당이므로 기본값은 0이다. 따라서 0,0,0.0,? object형은 뭔지 모르겠다. 하지만 0000일듯
