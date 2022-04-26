package com.example.rom.concurrency;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * SimpleDataFormat Thread Safe Utils
 *
 * @author Roman Fu
 * @version 1.0
 */
public class DataFormatSafe {
    private final static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap =
            new HashMap<>();
    private final static ReentrantLock sdfLock = new ReentrantLock();  // obj lock

    /**
     *
     *
     * @param pattern data format pattern
     * @return SimpleDateFormat
     */
    public static SimpleDateFormat getDateFormat(final String pattern) {
        ThreadLocal<SimpleDateFormat> tl = sdfMap.get(pattern);
        if (tl == null) {
            try {
                if (!sdfLock.tryLock(10, TimeUnit.MILLISECONDS)) {
                    return new SimpleDateFormat(pattern);
                }

                tl = sdfMap.get(pattern);
                if (tl == null) {
                    tl = ThreadLocal.withInitial(() -> new SimpleDateFormat(pattern));
                    sdfMap.put(pattern, tl);
                }
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage());
            } finally {
                sdfLock.unlock();
            }
        }
        return tl.get();
    }
}
