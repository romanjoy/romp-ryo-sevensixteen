package jedis;

import redis.clients.jedis.Jedis;

/**
 * RedisLock <br>
 *
 * @author Roman Fu
 * @version 1.0
 */
public class RedisLock {
    private static final long NANO_TIME = 1000 * 1000L;
    private static final Jedis client = new Jedis("127.0.0.1", 6637);

    /**
     *
     * @param key  business key
     * @param timeout timeout (second)
     * @param expire  expire time (second)
     * @return true/false
     */
    public static boolean lock(String key, int timeout, int expire) {
        long startNano = System.nanoTime();
        timeout *= NANO_TIME;

        try {
            while (System.nanoTime() - startNano < timeout) {
                // getSet command can prevent dead lock
                if (client.setnx(key, "locked") == 1) {
                    client.expire(key, expire);
                    return true;
                }
            }
            // Thread sleep
        } catch (Exception e) {
            throw new RuntimeException("redis locking error", e);
        }
        return false;
    }
}
