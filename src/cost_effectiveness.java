/*
기계를 구입하려 하는데 이 기계는 추가 부품을 장착할 수 있다. 추가 부품은 종류당 하나씩만 장착 가능하고, 모든 추가 부품은 동일한 가격을 가진다.

원래 기계의 가격과 성능, 추가 부품의 가격과 각 부품의 성능이 주어졌을 때, 추가 부품을 장착하여 얻을 수 있는 최대 가성비를 정수 부분까지 구하시오(가격 및 성능은 상대적인 값으로 수치화되어 주어진다).

e.g.)

원래 기계의 가격 : 10

원래 기계의 성능 : 150

추가 부품의 가격 : 3

추가 부품의 성능 : 각각 30, 70, 15, 40, 65

추가 부품을 장착하여 얻을 수 있는 최대 가성비 : 17.81... → 17

(성능이 70과 65인 부품을 장착하면 됨)
 */

import java.util.Arrays;
import java.util.Collections;

public class cost_effectiveness {
    public static void main(String[] args) {

        /*
        CONSTANTS FOR ADDITIONAL PROBLEM SOLVING
         */
        final int DEF_COST = 10;
        final int DEF_POWER = 150;
        final int ADD_COST = 3;
        final Integer[] ADD_POWER = {30, 70, 15, 40, 65};


        System.out.println("Maximum Cost Effectiveness is " +
                (int) Math.floor(maxCostEffect(DEF_COST, DEF_POWER, ADD_COST, ADD_POWER)));
    }

    private static float maxCostEffect(int defC, int defP, int addCost, Integer[] addonPower) {
        float maxCostEffect = defP / defC;
        float bestCost = defC;
        float bestPower = defP;
        float costEffect;
        Arrays.sort(addonPower, Collections.reverseOrder());

        for (int i = 0; i < addonPower.length; i++) {
            Integer anAddonPower = addonPower[i];
            costEffect = (bestPower + anAddonPower) / (bestCost + addCost);
            if (maxCostEffect < costEffect) {
                maxCostEffect = costEffect;
                bestCost += addCost;
                bestPower += anAddonPower;
            }
        }
        return maxCostEffect;
    }
}
