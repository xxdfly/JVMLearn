import java.lang.ref.WeakReference;

/**
 * Created by wb-xxd249566 on 2017/4/5.
 */
public class WeakRef {
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
        WeakReference<User> userWeakReference = new WeakReference<>(u);
        u = null;
        System.out.println(userWeakReference.get());
        System.gc();
        System.out.println("After GC");
        System.out.println(userWeakReference.get());
    }
}
