package com.ravi.constructorchaining;
class Maths9 {
    Maths9(int d[][]) {
        String str = " ";
        for (int i = 0; i < d.length; i++) {
            for (int k = 0; k < d[i].length; k++) {
                if ((k == 1) || (k == 2)) {
                    str = str + d[i][k] + " ";

                }
            }
        }
        System.out.println(str + " ");
    }
}
        public class Assign9 {
            public static void main(String[] args) {
                int a[][]={{2,6,8},{5,9,1},{12,18,20}};
                Maths9 rav= new Maths9(a);
            }
}
