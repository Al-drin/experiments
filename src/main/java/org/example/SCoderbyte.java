package org.example;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SCoderbyte {

    static String solution1(String str) {
        str.length();

        String result = str;

        return result + 'a';
    }

    static String solution2(String str) {
        String[] times = str.split("-");

        String[] times1 = times[0].split(":");
        String[] times2 = times[1].split(":");

        int hours1 = Integer.parseInt(times1[0]);
        hours1 += times1[1].substring(times1[1].length()-2).equals("am") ? 0 : 12;

        int mins1 = Integer.parseInt(times1[1].substring(0, times1[1].length()-2));

        int hours2 = Integer.parseInt(times2[0]);
        hours2 += times2[1].substring(times2[1].length()-2).equals("am") ? 0 : 12;

        int mins2 = Integer.parseInt(times2[1].substring(0, times2[1].length()-2));

        if (hours1 == hours2 && mins1 == mins2) {
            return "0";
        }

        if (hours1 == hours2) {
            if (mins1 < mins2) {
                return ""+(mins2-mins1);
            } else {
                return ""+(24*60-(mins1-mins2));
            }
        }

        if (hours1 > hours2) {
            return ""+((((24-hours1)+hours2) * 60) - mins1 + mins2);
        } else {
            return ""+(((hours1-hours2) * 60) - mins1 + mins2);
        }
    }

    static String solution2_1(String str) {
        String[] times = str.split("-");

        if (times[0].charAt(1) == ':') {
            times[0] = "0" + times[0];
        }

        LocalTime time1 = LocalTime.parse(times[0].substring(0, times[0].length()-2));

        if (times[0].substring(times[0].length()-2).equals("pm")) {
            time1 = time1.plusHours(12);
        }

        if (times[1].charAt(1) == ':') {
            times[1] = "0" + times[1];
        }

        LocalTime time2 = LocalTime.parse(times[1].substring(0, times[1].length()-2));

        if (times[1].substring(times[1].length()-2).equals("pm")) {
            time2 = time2.plusHours(12);
        }

        return "" + (time1.until(time2, ChronoUnit.MINUTES) + (time1.isAfter(time2) ? 24*60 : 0));
    }

    /*
     * Have the function StockPicker(arr) take the array of numbers stored in arr which will contain integers that
     * represent the amount in dollars that a single stock is worth, and return the maximum profit that could have been
     * made by buying stock on day x and selling stock on day y where y > x.
     * For example: if arr is [44, 30, 24, 32, 35, 30, 40, 38, 15] then your program should return 16 because at
     * index 2 the stock was worth $24 and at index 6 the stock was then worth $40, so if you bought the stock at 24 and
     * sold it at 40, you would have made a profit of $16, which is the maximum profit that could have been made with this
     * list of stock prices.
     * If there is no profit that could have been made with the stock prices, then your program should return -1.
     * For example: arr is [10, 9, 8, 2] then your program should return -1.
     */
    static int solution3(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int minValue = arr[0];
        int maxValue = -1;

        for (int i=1; i<arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            } else {
                if (arr[i] - minValue > maxValue) {
                    maxValue = arr[i] - minValue;
                }
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        //System.out.println(solution1("abc"));
        System.out.println(solution2_1("1:01pm-11:00am"));
        System.out.println(solution2("1:01pm-11:00am"));
        //System.out.println(solution2("1:23am-1:08am"));
        //System.out.println(solution3(new int[]{44, 30, 24, 32, 35, 30, 40, 38, 15}));
        //System.out.println(solution3(new int[]{10, 9, 8, 2}));
    }
}
