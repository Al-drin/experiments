package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
                continue;
            }
            if (nums1[i] > nums2[j]) {
                result[k] = nums2[j];
                j++;
                k++;
                continue;
            }

            result[k] = nums1[i];
            result[k+1] = nums2[j];
            i++;
            j++;
            k+=2;
        }

        while (i < nums1.length) {
            result[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            result[k] = nums2[j];
            j++;
            k++;
        }

        if (result.length % 2 == 1) {
            return result[result.length/2];
        }

        return (result[(result.length/2)-1] + result[result.length/2]) / 2d;
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int[] result = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();

        Arrays.sort(result);

        if (result.length % 2 == 1) {
            return result[result.length/2];
        }

        return (result[(result.length/2)-1] + result[result.length/2]) / 2d;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println("Array 1: " + Arrays.toString(nums1));
        System.out.println("Array 2: " + Arrays.toString(nums2));
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1,2};
        int[] nums4 = {3,4};

        System.out.println("Array 1: " + Arrays.toString(nums3));
        System.out.println("Array 2: " + Arrays.toString(nums4));
        System.out.println("Median: " + findMedianSortedArrays2(nums3, nums4));
    }
}
