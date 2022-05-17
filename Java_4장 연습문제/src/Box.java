public class Box {
    private int width, height; // 박스의 너비와 높이
    private char fillChar; // 박스를 그리는 데 사용하는 문자
    public Box() { // 매개 변수 없는 생성자
        this(10,1); // this() 이용0
    }
    public Box(int width, int height) { // 너비외 높이의 2 매개 변수를 가진 생성자
        this.width = width;
        this.height = height;
    }
    public void draw() { // 박스 그리는 메소드
        for(int i=0; i<height; i++) {
            for(int j=0; j<width; j++)
                System.out.print(fillChar);
            System.out.println();
        }
    }
    public void fill(char c) { // 박스를 그리는데 사용하는 문자 설정
        this.fillChar = c;
    }
    public static void main(String[] args) {
        Box a = new Box(); // 10x1 사각형
        Box b = new Box(20,3); // 20x3 사각형
        a.fill('*'); // box를 그릴 때 사용하는 문자 '*'
        b.fill('%'); // box를 그릴 때 사용하는 문자 '%'
        a.draw(); // 박스 그리기
        b.draw(); // 박스 그리기
    }
}

