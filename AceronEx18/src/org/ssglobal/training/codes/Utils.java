package org.ssglobal.training.codes;

import java.util.Random;

public class Utils {
	private static final Random RAND = new Random();

    private Utils() {
        // Utilities class
    }
    
    public static int randomDistance(int distance) {
        return RAND.nextInt(distance + distance) - distance;
    }
}

