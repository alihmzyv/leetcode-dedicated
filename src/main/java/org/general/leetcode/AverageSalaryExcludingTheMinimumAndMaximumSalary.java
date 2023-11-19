package org.general.leetcode;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int count = salary.length - 2;
        int sum = 0;
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        for (int index = 0; index < salary.length; index++) {
            int sal = salary[index];
            if (sal > maxSalary) {
                maxSalary = sal;
            }
            if (sal < minSalary) {
                minSalary = sal;
            }
            sum += sal;
        }
        return (double) (sum - (maxSalary + minSalary)) / count;
    }
}
