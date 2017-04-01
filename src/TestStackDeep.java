import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by wb-xxd249566 on 2017/3/31.
 */
public class TestStackDeep {
    private static int count=0;

    public static void recursion(long a,long b,long c){
        long e=1,f=2,g=3,h=4,i=5,j=6,k=7,l=8,m=9,n=10;
        count++;
        recursion(a,b,c);
    }

    public static void recursion(){
        count++;
        recursion();
    }
    public static void main(String[] args){
        try {
            recursion();
//            recursion(0l,0l,0l);
        }catch (Throwable e){
            System.out.println("deep of calling = "+count);
//            e.printStackTrace();
        }
    }
}
