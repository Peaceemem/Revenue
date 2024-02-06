package com.peace.revenue;

public class Revenue {
        public static void main(String[] args) {
            Double[] revenue = {220.0, 150.0, 380.0, 460.0, 120.0, 600.0, 700.0, 800.0, 190.0, 300.0, 800.0, 100.0};

            double sum = 0.0;

            // Calculate the sum of all revenue values in the array
            for(int i = 0; i < revenue.length; i++) {
                sum += revenue[i];
            }

            // Calculate the average monthly revenue
            double averageRevenue = sum / revenue.length;

            System.out.println("Average monthly revenue for the year: " + averageRevenue);
        }
    }

