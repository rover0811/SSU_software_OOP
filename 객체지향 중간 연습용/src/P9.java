public class P9 {

    public static void main(String[] args){
        int x=3;
        A a = new A();
        System.out.println(x);//3
        x=4;
        a.a=5;//드디어 초기화
        System.out.println(a.a);//5
        A.print(x, a); // 5 7 5

        System.out.println(x); //4
        System.out.println(a.a); //5

    }
}
class A{
    int a ;
    static void print(int y,A a){//x 4, a 5로 들어감
        y+=1; //5
        System.out.println(y); //5
        a.a=y+2;
        System.out.println(a.a); //7
        a = new A();
        a.a=y; //5
        System.out.println(a.a);
    }

}

