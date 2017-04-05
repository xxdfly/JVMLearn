import java.lang.ref.SoftReference;

/**
 * Created by wb-xxd249566 on 2017/4/5.
 * -Xmx10m
 */
public class SoftRef {
    public static class User{
        public User(int id,String name){
            this.id = id;
            this.name = name;
        }
        public int id;
        public String name;

        @Override
        public String toString() {
            return "[id="+String.valueOf(id)+",name="+name+"]";
        }
    }

    public static void main(String[] args){
        User u = new User(1,"xxd");
        SoftReference<User> userSoftRef = new SoftReference<>(u);
        u = null;

        System.out.println(userSoftRef.get());
        System.gc();
        System.out.println(userSoftRef.get());

        byte[] b = new byte[1024*937*7];
        System.gc();
        System.out.println("After GC");
        System.out.println(userSoftRef.get());
    }

}
