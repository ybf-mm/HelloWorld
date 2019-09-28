package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] nums = {-1,0,1,2,-10000000,-400000};
        int i=10;
        List<List<Integer>> threeSum = threeSum(nums);
        System.out.println(threeSum);
    }
    public static  List<List<Integer>> threeSum(Integer[] nums){
        List list = new ArrayList();
        for (int i = 0; i <nums.length-2 ; i++) {
            for (int j = i+1,z=j+1; z <nums.length ; z++) {
                List intList = new ArrayList();
                if(nums[i]+nums[j]+nums[z]==0){
                    intList.add(nums[i]);
                    intList.add(nums[j]);
                    intList.add(nums[z]);
                    list.add(intList);
                }
            }
        }
        return list;
    }
}
