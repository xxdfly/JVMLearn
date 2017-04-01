/**
 * Created by wb-xxd249566 on 2017/4/1.
 * -Xmx20m -Xms5m -XX:+PrintCommandLineFlags -XX:+PrintGCDetails -XX:+UseSerialGC
 */
public class HeapAlloc {

    public static void main(String[] args){
        printMemoryStatus();
        alloc(1);
        printMemoryStatus();
        alloc(4);
        printMemoryStatus();

    }

    public static void printMemoryStatus(){
        System.out.println("Max Memory="+Runtime.getRuntime().maxMemory()+"bytes");
        System.out.println("Free Memory="+Runtime.getRuntime().freeMemory()+"bytes");
        System.out.println("Total Memory="+Runtime.getRuntime().totalMemory()+"bytes");
    }

    public static void alloc(int size){
        byte[] b = new byte[size*1024*1024];
        System.out.println("Alloc "+size+"M Space");
        System.out.println("=========================================================================");
    }
}
