/**
 * Created by wb-xxd249566 on 2017/3/31.
 */
public class OnStackTest {
    public static class User{
        public int id = 0;
        public String name = "";
    }

    public static void alloc(){
        User u = new User();
        u.id = 5;
        u.name = "xuexd";
    }

    public static void main(String[] args) throws InterruptedException{
        long b = System.currentTimeMillis();
        for (int i=0;i<100000000;i++){
            alloc();
        }
        long e = System.currentTimeMillis();
        System.out.println(e-b);
    }
}
