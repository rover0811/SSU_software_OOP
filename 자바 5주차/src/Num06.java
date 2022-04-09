import java.util.Scanner;

public class Num06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("근무시간과 시급을 입력");
        int work= scanner.nextInt();
        int payforhour= scanner.nextInt();
        int pay=work*payforhour;
        double extrapay=pay+(work-160)*0.5*payforhour;
        if (work<160) System.out.println("급여: "+pay+"원");
        else if (160<=work&&work<180) System.out.println("급여"+extrapay+"원");
        else System.out.println("근무시간 180시간 초과");

    }
}
