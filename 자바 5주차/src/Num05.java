public class Num05 {
    public static void main(String[] args) {
        int sumfor2=0;
        int sumfor1=0;
        for (int i=0;i<101;i+=2)
            sumfor2+=i;
        for (int j=1;j<101;j+=2)
            sumfor1+=j;

        System.out.println("홀수의 합:"+sumfor1);
        System.out.println("짝수의 합:"+sumfor2);

    }
}
