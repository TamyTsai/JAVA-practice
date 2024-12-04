// package application;

// public class bmi_calculator {
    
// }

// BMI計算機

import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("請輸入你的身高(公分):");
    double height  = scanner.nextDouble(); // 將使用者輸入的身高數值儲存到變數height
    // height = height / 100;
    height /= 100;

    System.out.println("請輸入你的體重(公斤):");
    double weight = scanner.nextDouble();

    // double bmi = weight/(height*height);
    double bmi = weight/Math.pow(height, 2);
    bmi = Math.round(bmi*10) / 10.0;
    System.out.println("你的BMI為" + bmi);
}