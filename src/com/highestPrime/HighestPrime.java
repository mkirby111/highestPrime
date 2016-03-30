package com.highestPrime;

/**
 *
 */
public class HighestPrime {
    private static long time = System.currentTimeMillis();
    private static long duration = 60000;
    private static long totalTime =  time + duration;

    public static void main(String[] args) throws InterruptedException {
        int maxPrime = 2;
        int num = 1;

        while (System.currentTimeMillis() <= totalTime) {
            int previousMaxPrime = maxPrime;
            if (isPrime(num) == true)
                maxPrime = num;
            if ((System.currentTimeMillis()%1000 == 0) && (previousMaxPrime < maxPrime))
                printProgress(maxPrime);
            num++;
        }
        printFinal(maxPrime, getElapsedTime());
    }

    /**
     *
     * @param maxPrime
     * @param seconds
     */
    private static void printFinal(int maxPrime, int seconds) {
        System.out.println("===============================================");
        System.out.println("Total Time: " +  seconds + " seconds");
        System.out.println("Highest Prime: " + maxPrime);
        System.out.println("===============================================");
    }

    private static void printProgress(int maxPrime) throws InterruptedException {
        System.out.println("Time: " + getElapsedTime() + " seconds\t\t" + "Highest Prime: " + maxPrime);
    }

    private static int getElapsedTime() {
        return (int) ((System.currentTimeMillis()-time)/1000);
    }

    public static boolean isPrime(int n) {
        //check for negative, 0, or 1
        if (n<=1) return false;
            //check for 2 or 3
        else if (n <= 3) return true;
            //check if multiple of 2
        else if (n%2==0) return false;
        //check the odds greater than 3
        for (int i = 3; i*i<=n; i+=2)
            if (n%i==0) return false;
        return true;
    }
}
