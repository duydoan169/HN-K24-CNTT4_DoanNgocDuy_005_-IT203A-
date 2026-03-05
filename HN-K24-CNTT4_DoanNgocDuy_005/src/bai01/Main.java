package bai01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> arrayList = new ArrayList<>();
        double max = 0;
        double sum = 0;
        double min = 0;
        int countExpress = 0;
        int n = 0;
        do {
            System.out.print("Nhap N: ");
            n = sc.nextInt(); sc.nextLine();
            if(n <= 0){
                System.out.println("Khong hop le! Nhap lai");
            }
        }while (n <= 0);

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phi van chuyen don hang " + (i+1) + ": ");
            double value = sc.nextDouble(); sc.nextLine();
            if (value < 0 ){
                System.out.println("Khong hop le! Nhap lai");
                i--;
                continue;
            }
            arrayList.add(value);
            if(i == 0){
                min = value;
                max = value;
            }
            sum += value;
            if (max < value){
                max = value;
            }
            if (min > value){
                min = value;
            }
            if(value >= 50){
                countExpress++;
            }
        }
        TreeSet<Double> treeSet = new TreeSet<>(arrayList);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + (sum/n));
        System.out.println("Unique: " + treeSet.descendingSet());
        System.out.println("Express: " + countExpress);

    }
}
