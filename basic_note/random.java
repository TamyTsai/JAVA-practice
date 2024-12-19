// package basic_note;

// public class random {
    
// }

// 產生隨機數字

import java.util.Random; //引入隨機產生器

void main() {
	Random random = new Random(); // 創建名為random的隨機產生器
	
	int x = random.nextInt(); // 請隨機產生器random隨機產生整數 並存入 資料型態為整數的變數x
	System.out.println(x); // x隨機產生的範圍在整數資料型態的範圍中(-2147483648~2147483647)
	
	int y = random.nextInt(3); // 隨機產生的數字範圍介於0~2
	System.out.println(y);
	
	int z = random.nextInt(3) + 1; // 隨機產生的數字範圍介於0~2 但存入變數z的範圍介於1~3
	System.out.println(z);
	
	double a = random.nextDouble(); // 隨機產生0~1之浮點數
	System.out.println(a);
	
	boolean b = random.nextBoolean(); // 隨機產生true或false
	System.out.println(b);
}
