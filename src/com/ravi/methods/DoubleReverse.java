package com.ravi.methods;
class Reverse
{
    void Reverse(double d[][]) {
        for (int i = d.length - 1; i >= 0; i--) {
            for (int k = d[i].length - 1; k >= 0; k--) {
                if (i == 0) {
                    System.out.println(d[i][k] + " ");
                }
            }
        }
    }
}
 public class DoubleReverse {
     public static void main(String[] args) {
         Reverse rav= new Reverse();
         double d[][]={{11.3,22.8,33.5},{44.2,55.1,66.3},{77.6,88.4,99.6}};
         rav.Reverse(d);
     }

 }



