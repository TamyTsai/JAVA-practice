// package basic_note;

// public class input {
    
// }


// 取得使用者輸入

import java.util.Scanner; // 引入JAVA掃描器

void main() {
	Scanner scanner = new Scanner(System.in); // 創建掃描器，掃描器命名為scanner
	// 不一定要取名為scanner
	
	System.out.println("請輸入你的名字");
	String name = scanner.nextLine(); // 掃描使用者的輸入，掃描到的輸入 會被回傳(覆蓋)到 呼叫掃描器的地方(scanner.nextLine())
	System.out.println("你好" + name);
	
	System.out.println("請輸入你的年紀");
	// String age = scanner.nextLine(); // scanner.nextLine()預設 會將使用者的輸入以 字串 型態回傳
	int age = scanner.nextInt();
	System.out.println(age + 10);
	// ("18"+10) 數字10會被轉成字串
	
	System.out.println("請輸入你的身高");
	// int height = scanner.nextInt(); // 只接受整數輸入
	double height = scanner.nextDouble();
	System.out.println("你的身高:" + height);
}