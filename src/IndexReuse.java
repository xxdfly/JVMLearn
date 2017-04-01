import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by wb-xxd249566 on 2017/3/31.
 */
public class IndexReuse {

    public void localvar1(){
        int a = 0;
        System.out.println(a);
        int b = 0;
    }
    public void localvar2(){
        {
            int a = 0;
            System.out.println(a);
        }
        int b = 0;
    }
}


