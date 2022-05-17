
public class forTest {
    public static void main(String[] args) {
        int a=4;
        int b=3;
        System.out.println(1+23+"45");//2445
        System.out.println(0.5*3+3/2*0.5);//1.5+0.5.... 정수 나눗셈은 몫만 나온다
        System.out.println((double)1/4);//0나올 것 같았지만 double한테 잔뜩 쫄아버린 4
        //System.out.println(1=2); 안됨 변수가 좌항에 있어야함
        //System.out.println(a>b?(Boolean)1;(Boolean)0); int형을 불리안 값으로 바꿀 수 없다네
        System.out.println(!((!true||true)&&false));//이건 애매한데 true면 되고 True면 안됨
        System.out.println((1<2) == false);
    }
}
