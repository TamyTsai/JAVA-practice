// package basic_note;

// public class nested_loop {
    
// }


// 巢狀迴圈 nested loop

void main() {
	
	// 迴圈中再寫迴圈
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.println(i + ", " + j);
		} // 內部迴圈結束後 跳出來 進行外部迴圈
	}
	// 印出 
	// 0,0
	// 0,1
	// 0,2
	// 1,0
	// 1,1
	// 1,2
	// 2,0
	// 2,1
	// 2,2
	
	
	// 巢狀迴圈 搭配 二維陣列
	int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {5, 6, 7}};
	for(int i=0; i<4; i++) {
		for(int j=0; j<3; j++) {
			System.out.println(nums[i][j]);
		}
		System.out.println(); // 換行
	}
	// 印出
	// 123
	// 456
	// 789
	// 567
	
}