/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author bhosaman
 */
public class ArrayAdd {

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[100];
        int size = nums.length;
        int arrIndex = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (nums[i] + nums[j] == target) {

                    result[arrIndex] = i;
                    result[arrIndex + 1] = j;

                    return result;

                }

            }
        }

        return result;

    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int re = 9;

        int res[] = twoSum(arr, re);
        System.out.println(res[0] + "," + res[1]);

    }
}
