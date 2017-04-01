/**
 * Created by wb-xxd249566 on 2017/3/31.
 */
public class LocalVarTabGc {

    public void localvarGc1(){
        byte[] a = new byte[6*1024*1024];
        System.gc();
    }

    public void localvarGc2(){
        byte[] a = new byte[6*1024*1024];
        a = null;
        System.gc();
    }

    public void localvarGc3(){
        {
            byte[] a = new byte[6*1024*1024];
        }
        System.gc();
    }

    public void localvarGc4(){
        {
            byte[] a = new byte[6*1024*1024];
        }
        int c = 10;
        System.gc();
    }

    public void localvarGc5(){
        localvarGc1();
        System.gc();
    }

    public static void main(String[] args){
        LocalVarTabGc ins = new LocalVarTabGc();
        ins.localvarGc5();
    }
}
