// package application;

// public class guess_number_game {
    
// }

// 猜數字遊戲（1~100）

import java.util.Random;
import java.util.Scanner;

void main() {

	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	int answer = random.nextInt(100) + 1; // 隨機產生0~99的數字，將1~100存入變數answer
	
	int guess = scanner.nextInt(); // 掃描使用者的輸入，將使用者輸入的整數存入變數guess
	
	while(true) { // 寫true就可以讓裡面的程式碼重複執行不固定次數，直到遇到break
		System.out.print("請輸入1~100的數字："); // 直接在冒號後輸入 不換行
		if (guess < answer) {
			System.out.println("大一點");
		} else if (guess > answer) {
			System.out.println("小一點");
		} else if (guess == answer) {
			System.out.println("恭喜你答對了！");
			break;
		} else {
			System.out.println("輸入不在範圍內");
		}
	}

}