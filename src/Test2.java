import java.lang.reflect.Array;
import java.util.*;

public class Test2 {

    private int x=2;
    protected int y=3;
    private static int x1=4;
    protected static int y1=5;

    public static void main(String[] args) {
        int x=6;
        int y=7;
        int x1=8;
        int y1=9;
        new Test2().new sec().go();
    }
//        List<Integer> list= new ArrayList<Integer>();
//        list.add (1);
//        list.add (2);
//        list.add (3);
//        list.add (5);
//
//        Collections.synchronizedList(list);
//
//        for (Integer i : list) {
//            if (i == 3) {
//                int index = list.indexOf(3);
//                list.add(index + 1, 0);
//            }
//        }
//
//        System.out.println(list);
class sec{

    void go(){
        System.out.println(x + " " +y +" " + x1 + " "+ y1);
    }
    }



//    enum Status {
//        SUCCESS, FAILURE;
//
//        static {
//            System.out.print(" SO");
//        }
//
//        {
//            System.out.print(" IO");
//        }
//
//        Status() {
//            System.out.print(" CO");
//        }
//    }
//
//    class Payment {
//        Status status;
//
//        static {
//            System.out.print(" STC");
//        }
//
//        {
//            System.out.print(" ITC");
//        }
//
//        Payment() {
//            status = Status.SUCCESS;
//            System.out.print(" CTC");
//        }
//    }
//
//    public class App {
//        public static void main(String[] args) {
//            Payment p1 = new Payment();
//            Payment p2 = new Payment();
//        }
//    }

//Output : STC ITC IO CO IO CO SO CTC ITC CTC



}
