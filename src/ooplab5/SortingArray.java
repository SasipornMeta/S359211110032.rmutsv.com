package ooplab5;

//1. allow user input into array : inputData , ShowData
//2. find summation of data in array
//3. find average value in array
//4. find maximum value in array
//5. find minimum value in array
//6. sorting data in array (Descending order)
//7. sorting data in array (Ascending order)

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    private static int MAX = 5;
    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        num = inputData(num);

        ShowData(num);
        findSummation(num);
        findMax(num);
        findMin(num);

    } // main

    private static void findMin(Integer[] num) {                            // หาค่าน้อยสุด
        System.out.println("The Minimum value is :"+
                Collections.min(Arrays.asList(num)));
    } // findMin

    private static void findMax(Integer[] num) {                            // หาค่ามากสุด
        System.out.println("The Maximum value is :"+
                Collections.max(Arrays.asList(num)));
    } // findMax

    private static void findSummation(Integer[] num) {                      // หาผลรวม
        Integer total = 0;
        for (int val : num)
            total += val;
        System.out.println("The Summation is :"+total );

        findAverage(total);
    }

    private static void findAverage(Integer num) {                          // หาค่าเฉลี่ย
        System.out.println("The Average value is :"+num/MAX);
    } // findAverage

    private static void ShowData(Integer[] num) {                           // แสดงข้อมูล
        System.out.println("Data in array :");
        for (int i : num) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static Integer[] inputData(Integer[] num) {                     // user ใส่ข้อมูล
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer :");
        for (int i=0;i<num.length;i++) {
            System.out.print("num["+i+"] : ");
            num[i] = scanner.nextInt();
        }

        return num;
    } // inputData


} // class
