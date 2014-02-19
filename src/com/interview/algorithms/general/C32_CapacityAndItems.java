package com.interview.algorithms.general;

/**
 * Created with IntelliJ IDEA.
 * User: stefanie
 * Date: 14-2-19
 * Time: 上午8:43
 * To change this template use File | Settings | File Templates.
 *
 * Shopkeeper want sells in the packs of 20,9 and 6.
 * Given an n, you need to find whether its possible to buy the items or not.
 * For example n=21, you can buy 2 packs of 6 and one pack of 9(2*6 + 9)
 */
public class C32_CapacityAndItems {

    public boolean check(int N, int[] packs) {

        return check(N, 0, packs);

    }

    public boolean check(int N, int currentSum, int[] packs) {
        if(currentSum > N)
            return false;
        if(currentSum == N)
            return true;
        for(int i = 0; i < packs.length; i ++) {
            if(this.check(N, currentSum + packs[i], packs))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
