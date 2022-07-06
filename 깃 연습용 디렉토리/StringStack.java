import java.util.Scanner;

interface Stack{
    int length();
    int compacity();
    String pop();
    boolean push(String val);
}
public class StringStack implements Stack {
    private String arr[];
    private int top=-1; //기본 값으로 설정
    static Scanner scanner=new Scanner(System.in);
    @Override
    public int length() {
        return top+1;
    }

    @Override
    public int compacity() {
        return arr.length;
    }

    @Override
    public String pop() {
        if (top==-1)return "Empty";
        else {
            return arr[top--];
        }
    }

    @Override
    public boolean push(String val) {
        if(top==arr.length-1)return false;
        else{
            arr[++top]=val;
            return true;
        }
    }
    StringStack(int capacity){
        arr=new String[capacity];
    }
    StringStack(){}
    void Menu(){
        int select=-1;
        while(select!=6){
            System.out.println("스택 프로그램입니다. 1은 푸쉬, 2는 팝, 3은 스택의 길이, 4는 스택의 용량, 5는 스택의 요소를 보여줍니다, 6은 종료");
            select=scanner.nextInt();
            switch (select){
                case 1:{
                    System.out.println("푸쉬할 문자열을 입력");
                    push(scanner.next());break;
                }
                case 2:
                    System.out.println(pop());break;
                case 3:System.out.println(length());break;
                case 4:System.out.println(compacity());break;
                case 5:show();break;
                case 6:select=6;break;
            }

        }
    }
    void show(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
class executionStack{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("스택의 크기를 입력");
        StringStack stack=new StringStack(scanner.nextInt());
        stack.Menu();
    }
}
