package com.ravi.methods;
class PrimeCount {
    void primeconum9() {
        int num = 100;
        int f;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            f = 0;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    f++;
                    break;
                }
            }
            if (f == 0) {
                count++;
            }
        }
        System.out.println("Count of Prime Numbers:" + count);
    }
}
public class CountOfPrime {
    public static void main(String[] args) {
        PrimeCount rav=new PrimeCount();
        rav.primeconum9();
    }
}
