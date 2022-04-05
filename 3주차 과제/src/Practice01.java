import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        System.out.println("점(x,y)의 좌표를 입력하세요.>>");
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        int y= scanner.nextInt();
        if ((50<=x)&&(x<=100)){
            if((50<=y)&&(y<=100)){
                System.out.println("점("+x+","+y+")은 (50,50)과 (100,100)사이에 있습니다");
            }
            else{
                System.out.println("점("+x+","+y+")은 (50,50)과 (100,100)사이에 없습니다");
            }
        }
    }
}
