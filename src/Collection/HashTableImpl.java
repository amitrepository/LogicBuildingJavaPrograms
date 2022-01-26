package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableImpl {

    public static void main(String args[]){

        Map m= new Hashtable<String ,Integer>();
        m.put("Amit",100);
       // m.put(null,null);

        System.out.println(m);

        Map m1= new HashMap<String ,Integer>();
        m1.put("Amit",100);
        m1.put(null,null);
        m1.put(null,null);



    }
}
