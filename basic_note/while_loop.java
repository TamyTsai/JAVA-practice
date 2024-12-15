// package basic_note;

// public class while_loop {
    
// }

// while loop 迴圈

void main() {

	int i = 0;
	while(i<3) { //持續執行程式碼敘述，直到變成false
		System.out.println(i);
		i += 1; // i++
	}
	// 輸出 0 1 2
	
	int j = 0;
	while(j<0) { //不會執行程式碼敘述
		System.out.println(i);
		i += 1; // i++
	}
	
	// 先執行程式碼後 才去判斷條件是否成立的 while迴圈 寫法
	do {
		System.out.println(i);
		i++;
	} while(i<0);
	// 輸出0
	
	do {
		System.out.println(i);
		i++;
	} while(i<3);
	// 輸出0 1 2
	
	// while與array搭配
	int[] nums = {10, 20, 30};
	while(i < nums.length) { // nums.lenght 為 3
		System.out.println(nums[i]); // i = 0 1 2 
		i++;
	}
	// 輸出 10 20 30

}