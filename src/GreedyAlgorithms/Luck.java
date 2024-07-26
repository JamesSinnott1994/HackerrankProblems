package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Luck {

    public static void runLuckBalance() {

        int k = 3;
        List<List<Integer>> contests = new ArrayList<>();

        List<Integer> contest1 = new ArrayList<>();
        contest1.add(5);
        contest1.add(1);
        contests.add(contest1);

        List<Integer> contest2 = new ArrayList<>();
        contest2.add(2);
        contest2.add(1);
        contests.add(contest2);

        List<Integer> contest3 = new ArrayList<>();
        contest3.add(1);
        contest3.add(1);
        contests.add(contest3);

        List<Integer> contest4 = new ArrayList<>();
        contest4.add(8);
        contest4.add(1);
        contests.add(contest4);

        List<Integer> contest5 = new ArrayList<>();
        contest5.add(10);
        contest5.add(0);
        contests.add(contest5);

        List<Integer> contest6 = new ArrayList<>();
        contest6.add(5);
        contest6.add(0);
        contests.add(contest6);

        System.out.println("Maximum luck balance is: " + luckBalance(k, contests));

    }

    public static int luckBalance(int k, List<List<Integer>> contests) {

        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        int totalImp = 0;
        int totalLuck = 0;

        for(int i = 0; i < contests.size(); i++) {

            totalLuck += contests.get(i).get(0);

            if(contests.get(i).get(1) == 0) {
                l2.add(contests.get(i).get(0));
            }
            else {
                l1.add(contests.get(i).get(0));
                totalImp++;
            }
        }

        Collections.sort(l1);
        Collections.sort(l2);
        l1.addAll(l2);

        /*
        For each important contest Lena wins, we need to decrease her luck by twice the contest's luck value. This is because:
        Initially, totalLuck included the contest's luck value as if Lena lost the contest.
         */
        for(int i = 0; i < (totalImp-k); i++){
            totalLuck = totalLuck - 2 *(l1.get(i));
        }


        return totalLuck;

    }

}
