class Cup{
    Cup(int marker){
        System.out.println("Cup(" + marker + ")");
    }//3. cup(1), cup(2)
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}
class Cups{
    static Cup cup1;//static이 먼저-> 1.
    static Cup cup2;
    static{
        cup1 = new Cup(1);//2.
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups( )");
    }//4. Cups()
}
public class StaticTest {
    public static void main(String[] args) {
        System.out.println("main( )");//main ()
        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();//정리 static 먼저 그다음은 공유 or 실행 x 그다음 메인
}
