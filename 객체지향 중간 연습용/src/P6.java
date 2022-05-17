public class P6 {

    public static void main(String[] args){
        int[] a = {10,100};
        int[] b = {20,200,2000};

        int[][] test =new int[2][3];
        test[0]=a;
        test[1]=b;

        for(int j=0;j<test.length; j++       ){
            for(int i=0;i<test[j].length;i++      )
                System.out.print(test[j][i]+" ");
            System.out.println(" ");
        }

    }
}
