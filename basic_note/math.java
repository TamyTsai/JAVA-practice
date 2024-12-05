// package basic_note;

// public class math {
    
// }

// 數學計算用法

void main() {
	int a = 10;
	System.out.println(a/3); // 會輸出3
	// 整數與整數做運算時，結果只會是整數(跟Ruby Python一樣)
	
	double b = 10;
	System.out.println(b/3); // 會輸出3.3333333333333335 // 電腦運算也不完全視精準的

	int c = 10;
	System.out.println(c%3); //取餘數 // 會輸出1
	
	int d=10;
	d = d + 1; // d+=1
	System.out.println(d);
	
	// 取最大
	System.out.println(Math.max(10, 5)); // 會輸出10
	
	int e =20;
	int f = 28;
	System.out.println(Math.max(e, f)); // 會輸出28
	
	// 取最小
	System.out.println(Math.min(10, 5)); // 會輸出5

	// 次方運算
	System.out.println(Math.pow(3, 2)); // 會輸出9
	
	// 四捨五入
	System.out.println(Math.round(3.666)); // 會輸出4
	System.out.println(Math.round(3.466)); // 會輸出3
	
	// 無條件進位
	System.out.println(Math.ceil(3.466)); // 會輸出4

	// 無條件捨去
	System.out.println(Math.floor(3.666)); // 會輸出3
	
	// 四捨五入到指定位數
	System.out.println(Math.round(3.466*10)/10.0); // 四捨五入到小數點第一位 // 輸出3.5
	// 跟10.0做運算 結果才不會只能得到整數
	System.out.println(Math.round(3.466*100)/100.0);  // 四捨五入到小數點第一位 // 輸出3.47

	// 無條件進位到指定位數
	System.out.println(Math.ceil(3.466*10)/10.0); // 無條件進位到小數點第一位 // 會輸出3.5

}