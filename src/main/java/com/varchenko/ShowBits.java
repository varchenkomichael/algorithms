package com.varchenko;

public class ShowBits {
    int numbits;

    ShowBits(int n){
        numbits = n;
    }
    int show(long val) {
        long mask = 1;
        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask !=0 ; mask>>=1){
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % numbits) == 0){
                System.out.println(" ");
                spacer = 0;

            }
            if (val < 0) throw new RuntimeException();//todo check the real number of argument
        }
        System.out.println();
        return spacer;
    }
}
