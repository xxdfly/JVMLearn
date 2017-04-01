/**
 * Created by wb-xxd249566 on 2017/4/1.
 */
public class HeapAlloc {
    public static void main(String[] args){
        log("Max Memory="+Runtime.getRuntime().maxMemory()/1024/1024+"M");
        log("Free Memory="+Runtime.getRuntime().freeMemory()/1024/1024+"M");
        log("Total Memory="+Runtime.getRuntime().totalMemory()/1024/1024+"M");

        byte[] b = new byte[1*1024*1024];
        log("Alloc 1M Space");

        log("Max Memory="+Runtime.getRuntime().maxMemory()/1024/1024+"M");
        log("Free Memory="+Runtime.getRuntime().freeMemory()/1024/1024+"M");
        log("Total Memory="+Runtime.getRuntime().totalMemory()/1024/1024+"M");

        b = new byte[4*1024*1024];
        log("Alloc 4M Space");

        log("Max Memory="+Runtime.getRuntime().maxMemory()/1024/1024+"M");
        log("Free Memory="+Runtime.getRuntime().freeMemory()/1024/1024+"M");
        log("Total Memory="+Runtime.getRuntime().totalMemory()/1024/1024+"M");

    }

    public static void log(String str){
        System.out.println(str);
    }
}
