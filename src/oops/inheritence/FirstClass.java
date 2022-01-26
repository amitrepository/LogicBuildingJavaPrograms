package oops.inheritence;

import java.util.HashMap;

public class FirstClass {
    HashMap<Integer, Object> hashMap = new HashMap<Integer, Object>();

    public void add(int key, Integer value) {
        hashMap.put(key, value);
    }
}

class SecondClass extends FirstClass {
    public void add(int key, String value) {
        hashMap.put(key, value);
    }

    public void display() {
        Integer[] result = new Integer[hashMap.size()];
        hashMap.keySet().toArray(result);
        for (int i : result) {
            //System.out.println( " rem " + i % 2);
            System.out.println(hashMap.get(i % 2));
        }
    }
}

// 1  // 2 //3  // 6

//final out put
//        one
//                null
//                one
//                null
