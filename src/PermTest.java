/**
 * Created by wb-xxd249566 on 2017/3/31.
 */
public class PermTest {
    public static class CglibBean{
        int id = 0;
        String name = "";
        public CglibBean(int id,String name){

        }
    }

    public static void main(String[] args){
        int i=0;
        try {
            for (i = 0; i < 100000; i++){
                CglibBean bean = new CglibBean(i,"xxd"+i);
            }
        }catch (Exception e){
            System.out.println("total create count:" +i);
        }
    }
}
