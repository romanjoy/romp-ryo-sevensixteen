package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author fuqiliang
 * <p>
 * hashMap foreach
 */
public class HashMapForEach {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(3);  // should be init
        map.put("age1", 3);
        map.put("age2", 4);
        map.put("age3", 5);

        /* foreach - entrySer better to be used */
        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> next = entryIterator.next();
            System.out.println("key=" + next.getKey() + ",value=" + next.getValue());
        }
    }
}
