/**
 * Created by wb-xxd249566 on 2017/3/31.
 */
public class EscapeAnalysis {

    public static void alloc(){
        User u = new User();
        u.id=5;
        u.name="xuexd";
    }
}

class User{
    int id;
    String name;
}
