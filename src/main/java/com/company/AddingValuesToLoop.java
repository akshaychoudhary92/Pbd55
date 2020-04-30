package com.company;

import java.util.Scanner;

public class AddingValuesToLoop {
    public void sumUSerInput(){
        Scanner s = new Scanner(System.in);
        int num = 0;
        int total = 0;
        System.out.println("I will add up the numbers you give me");
        while(true){

            System.out.println("Enter a number");
            num = s.nextInt();
            System.out.println("Number: " + num);
            total = num + total;
            System.out.println("The total so far is: " + total);


            if(num == 0){
                break;
            }

        }
        System.out.println("the total is " + total);
    }
}
