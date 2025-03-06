
package com.javadeveloper;


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.print("Enter num: ");
        Scanner scan = new Scanner(System.in);
        int user_num = scan.nextInt();


        short [] nums =  new short[user_num];
        for (int i = 0; i < user_num; i++ ) {
            System.out.print("Enter element " + (i+1) + ": ");
            nums[i] = scan.nextShort();
        }

        short max_num = nums[0];
        for(int i = 0; i < user_num; i++){
            if(nums[i] > max_num)
                max_num = nums[i];
        }

        System.out.println("Max element: " + max_num);
        System.out.println("All elements: ");

        for (int i = 0; i < user_num; i++ )
            System.out.println(nums[i]);
    }
}
