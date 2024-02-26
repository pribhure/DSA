package org.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Greedy {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         // {4,2,1,1,2}
            int maxCandies =0;
          for(int i=0; i<candies.length;i++){
              if(candies[i]> maxCandies){
                  maxCandies = candies[i];
              }
          }
           List <Boolean> result = new ArrayList<>();
            Boolean r []  = new Boolean[candies.length];
            for(int i=0; i<candies.length;i++){
              r[i] =  candies[i] + extraCandies >= maxCandies;

            }
            result.addAll(List.of(r));
            return result;
        }
    public static void main(String[] args){
            int candies []= {4,2,1,1,2};
        System.out.println( kidsWithCandies(candies ,1));
}
}
