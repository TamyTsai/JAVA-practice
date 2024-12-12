// package basic_note;

// public class switch {
    
// }

// switch case 語句(跟javascript類似)

import java.util.Scanner;

void main() {
	Scanner scanner = new Scanner(System.in); //創建掃描器
	
	// 比較整數(switch語句不能做 浮點數 的比較)(故相較if語句，switch語句較不彈性，但比較精簡)
	int num = scanner.nextInt(); // 將使用者的輸入 以整數資料型態 存入 變數num
	
	switch(num) {
		case 1: // num為1時
			System.out.println("星期日");
			break;
		case 2:
			System.out.println("星期一");
			break; // 沒加break的話，當num為2時，除了星期一，後面其他程式碼也會被執行
		case 3:
			System.out.println("星期二");
			break;
		case 4:
			System.out.println("星期三");
			break;
		case 5:
			System.out.println("星期四");
			break;
		case 6:
			System.out.println("星期五");
			break;
		case 7:
			System.out.println("星期六");
			break;
		default:
			System.out.println("請輸入1~7");
			// 不用break
	}
	
	// 比較字串
	String key = scanner.nextLine();
	
	switch(key) {
		case "a":
			System.out.println("星期日");
			break;
		case "b":
			System.out.println("星期一");
			break;
		case "c":
			System.out.println("星期二");
			break;
		case "d":
			System.out.println("星期三");
			break;
		case "e":
			System.out.println("星期四");
			break;
		case "f":
			System.out.println("星期五");
			break;
		case "g":
			System.out.println("星期六");
			break;
		default:
			System.out.println("請輸入a~g");
			// 不用break
	}


}