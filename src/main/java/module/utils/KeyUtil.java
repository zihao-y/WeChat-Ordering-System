package module.utils;

import java.util.Random;

/**
 * Created by Zihao
 */

public class KeyUtil {

    /**
     * Generate the primary key
     * Format: time + random number
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
