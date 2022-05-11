import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Access/insert first in LinkedHashMap
 *
 * @author Roman Fu
 * @version 1.0
 */
public class LinkedHashMapGet {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lHashMap = new LinkedHashMap<>(5);  // insert first
        lHashMap.put(1, "新恒结衣");
        lHashMap.put(2, "长泽雅美");
        lHashMap.put(3, "佐佐木希");
        lHashMap.put(4, "石原里美");
        lHashMap.put(5, "堀北真希");

        for (Map.Entry<Integer, String> next : lHashMap.entrySet()) {
            System.out.println("index=" + next.getKey() + ", value=" + next.getValue());
        }

        System.out.print("\n");

        LinkedHashMap<Integer, String> lHashMap2 = new LinkedHashMap<>(5, 0.75f, true);
        lHashMap2.put(1, "新恒结衣");
        lHashMap2.put(2, "长泽雅美");
        lHashMap2.put(3, "佐佐木希");
        lHashMap2.put(4, "石原里美");
        lHashMap2.put(5, "堀北真希");
        lHashMap2.get(3);  // access-order
        lHashMap2.get(1);

        for (Map.Entry<Integer, String> next : lHashMap2.entrySet()) {
            System.out.println("index=" + next.getKey() + ", value=" + next.getValue());
        }
    }
}
