public class Workout {
    public static void main(String[] args) {
        hi d=new hi();
        System.out.println(hi.b.c);
    }

    class hi{
        class b{
            static int c=3;
        }
    }
}
