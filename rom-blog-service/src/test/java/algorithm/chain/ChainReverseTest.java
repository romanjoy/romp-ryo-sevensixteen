package algorithm.chain;

import org.junit.Assert;
import org.junit.Test;

public class ChainReverseTest {

    @Test
    public void chainReverse() {
        /* 水来自海上 -> 上海自来水 */
        ListNode<String> shang = new ListNode<>(null, "上");
        ListNode<String> hai = new ListNode<>(shang, "海");
        ListNode<String> zi = new ListNode<>(hai, "自");
        ListNode<String> lai = new ListNode<>(zi, "来");
        ListNode<String> shui = new ListNode<>(lai, "水");

        System.out.println(ChainReverse.reverse(shui).toString());
        Assert.assertNotNull(ChainReverse.reverse(shui).toString());
    }

    @Test
    public void chainReverseByRec() {
        /* 水来自海上 -> 上海自来水 */
        ListNode<String> shang = new ListNode<>(null, "上");
        ListNode<String> hai = new ListNode<>(shang, "海");
        ListNode<String> zi = new ListNode<>(hai, "自");
        ListNode<String> lai = new ListNode<>(zi, "来");
        ListNode<String> shui = new ListNode<>(lai, "水");

        System.out.println(ChainReverse.reverseByRec(shui).toString());
        Assert.assertNotNull(ChainReverse.reverseByRec(shui).toString());
    }
}
