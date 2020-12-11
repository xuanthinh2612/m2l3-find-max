package com.company;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        // write your code here
        int[] arr = new FindMax().insert();
        int max = new FindMax().Find(arr);
        System.out.println("so lon nhat trong mang vua nhao la:" + "\t" + max);

    }

    public int[] insert() {

        System.out.println("nhap vao so luong phan tu trong mang nho hon 20 phan tu");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 20) {
            System.out.println("nhap lai so phan tu nho hon 20");
            n = scanner.nextInt();
        }
        System.out.println("nhap vao gia tri cac phan tu");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public int Find(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
