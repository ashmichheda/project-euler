/*
* In England the currency is made up of pound, £, and pence, p,
* and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
*
* */


package com.ProjectEuler.progs;

public class Problem31 {

    public static void main(String[] args) {

        int a, b, c, d, e, f, g;
        int ans = 0, target = 200;
        long start = System.currentTimeMillis();
        for(a = target; a>=0; a -= 200){
            for(b = a; b>=0; b -= 100){
                for(c = b; c>= 0; c -= 50){
                    for(d = c; d>=0; d -= 20){
                        for(e = d; e>=0; e -= 10){
                            for(f = e; f>=0; f -= 5){
                                for(g = f; g>=0; g-= 2){
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The answer is: "+ans);
        long end = System.currentTimeMillis();
        System.out.println("Execution time in ms: "+(end-start));
    }
}
