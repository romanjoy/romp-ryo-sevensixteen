package collections;


import java.util.HashMap;
import java.util.Map;

/**
 * HashMap forEach: entrySet had better to be used.
 *
 * @author Roman Fu
 * @version 1.1 enhance foreach <br>
 * 1.0 Iterator while <br>
 */
public class HashMapForEach {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(3);  // init capacity
        map.put("age", 15);
        map.put("height", 176);
        map.put("weight", 70);

        for (Map.Entry<String, Integer> next : map.entrySet()) {
            System.out.println("key=" + next.getKey() + ", value=" + next.getValue());
        }
    }
}
