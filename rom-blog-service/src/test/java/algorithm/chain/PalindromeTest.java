package algorithm.chain;

import org.junit.Assert;
import org.junit.Test;


public class PalindromeTest {

    @Test
    public void isPalindrome() {
        /* 上海自来 水 来自海上 */
        ListNode<String> shang = new ListNode<>(null, "上");
        ListNode<String> hai = new ListNode<>(shang, "海");
        ListNode<String> zi = new ListNode<>(hai, "自");
        ListNode<String> lai = new ListNode<>(zi, "来");
        ListNode<String> shui = new ListNode<>(lai, "水");
        ListNode<String> la = new ListNode<>(shui, "来");
        ListNode<String> zii = new ListNode<>(la, "自");
        ListNode<String> ha = new ListNode<>(zii, "海");
        ListNode<String> shan = new ListNode<>(ha, "上");

        Assert.assertTrue(Palindrome.isPalindrome(shan));
    }
}
