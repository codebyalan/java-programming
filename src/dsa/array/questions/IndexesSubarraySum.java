/*
https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1
Indexes of Subarray Sum
Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.
Note: If no such array is possible then, return [-1].

Examples:
Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.

Input: arr[] = [5, 3, 4], target = 2
Output: [-1]
Explanation: There is no subarray with sum 2.


 */

package dsa.array.questions;

import java.util.ArrayList;

public class IndexesSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i < arr.length-1; i++){
            if(arr[i]==target){
                list.add(i+1);
                list.add(i+1);
                return list;
            }
            int sum = arr[i];
            for(int j = i+1; j<arr.length;j++){
                sum = sum + arr[j];
                if(sum==target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
            }
        }
        if(arr[arr.length-1]==target){
            list.add(arr.length);
            list.add(arr.length);
            return list;
        }
        list.add(-1);
        return list;
    }
}
