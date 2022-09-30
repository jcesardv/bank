package org.bank.common;

import java.util.Random;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Util {
    
    private static final Random       rand      = new Random();

    public static String createTracking() {
        int n = rand.nextInt(19);
        return UUID.randomUUID().toString().replace(Constant.HYPEN, Constant.EMPTY).substring(n, n + 12);
    }
}
