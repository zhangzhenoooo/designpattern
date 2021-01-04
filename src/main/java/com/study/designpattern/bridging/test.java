package com.study.designpattern.bridging;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by zhangz on 2020/12/31
 */
public class test {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        // 数据长度
        int length = nums.length;
        if(length < 3){
            // 小于3时直接返回空列表
            return new ArrayList<>();
        }

        for(int i=0;i < length - 2;i++){
            int first = nums[i];
            int second = nums[i+1];
            for(int j=i+2;j<length;j++){
                int third = nums[j];
                if((first + second + third) == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(first);
                    list.add(second);
                    list.add(third);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> lists = new test().threeSum(nums);
    }
}
