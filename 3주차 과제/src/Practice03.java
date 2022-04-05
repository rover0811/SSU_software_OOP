import java.util.Scanner;
public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String grade;
        System.out.println("학점의 등급을 입력하세요");
        grade= scanner.nextLine();
        switch (grade){
            case "a":
                System.out.println("Excellent!");
                break;
            case "b":
                System.out.println("Excellent!");
                break;
            case "c":
                System.out.println("Good!");
                break;
            case "d":
                System.out.println("Good!");
                break;
            case "f":
                System.out.println("Bye");
                break;

        }
    }
}
