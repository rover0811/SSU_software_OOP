public class P21{
    public static void main(String[] args) {


String[] ary = {"A","B","C"};
        int a=0,b=5;

        try{
        System.out.print(ary[a/5]);//"A"
        try{
        for(int i=1;i<4;++i)
        System.out.print(ary[i]);//"B" "C"
        }
        catch(Exception e){
        System.out.println("D");//"D"
        }
        finally{
        System.out.println("E");//"E"
        }
        }
        catch(Exception e){
        System.out.println("F");
        }
        finally{
        System.out.println("G");//"G

        }

    }}
