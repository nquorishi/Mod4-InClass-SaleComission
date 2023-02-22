/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salecomission;

/**
 *
 * @author Naweed
 */

public class SaleComission {

    public static void main(String[] args) {
        // Initializes the array of counters: 
        int[] counters = new int[9];

        // Defines the range limits: 
        int[] rangeLimits = {200, 300, 400, 500, 600, 700, 800, 900, 1000};

        // Defines the sales data for each salesperson: 
        int[] salesData = {5000, 2000, 700, 600, 1200, 3000, 800, 900, 1500, 2500, 3500};

        // Calculates the salaries and update the counters: 
        for (int i = 0; i < salesData.length; i++) {
            int salary = (int) (200 + 0.09 * salesData[i]);
            int index = 8;
            for (int j = 0; j < rangeLimits.length; j++) {
                if (salary < rangeLimits[j]) {
                    index = j;
                    break;
                }
            }
            counters[index]++;
        }

        // Prints the results in tabular format:
        System.out.println("Salary Range: \t\t Number of Salespeople:");
        System.out.println("$200-$299 \t\t " + counters[0]);
        System.out.println("$300-$399 \t\t " + counters[1]);
        System.out.println("$400-$499 \t\t " + counters[2]);
        System.out.println("$500-$599 \t\t " + counters[3]);
        System.out.println("$600-$699 \t\t " + counters[4]);
        System.out.println("$700-$799 \t\t " + counters[5]);
        System.out.println("$800-$899 \t\t " + counters[6]);
        System.out.println("$900-$999 \t\t " + counters[7]);
        System.out.println("$1000 + \t\t " + counters[8]);
    }
}
