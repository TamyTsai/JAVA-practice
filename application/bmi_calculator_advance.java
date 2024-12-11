// package application;

// public class bmi_calculator_advance {
    
// }

// 進階BMI計算機

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
	
	if (bmi<18.5) {
		System.out.println("體重過輕");
	} else if (bmi>=18.5 && bmi<24) { // 也可以只寫bmi<24
		System.out.println("體重正常");
	} else if (bmi>=24 && bmi<27) {
		System.out.println("體重過重");
	} else if (bmi>=27 && bmi<30) {
		System.out.println("輕度肥胖");
	} else if (bmi>=30 && bmi<35) {
		System.out.println("中度肥胖");
	} else {
		System.out.println("重度肥胖");
	}
}