// package basic_note;

// public class for_loop {
    
// }

// for 迴圈

void main() {

	for(int i=0; i<3; i++) { // 初始值 判斷條件 每次跑完迴圈後要做的變動
		System.out.println(i); // 得到 0 1 2
	}
	
	for(int i=10; i>0; i--) {
		System.out.println(i); // 得到 10 9 8 7 6 5 4 3 2 1
	}
	
	// 計算0加到100
	int sum = 0;
	for(int i=1; i<=100; i++) {
		sum += i;
	}
	System.out.println(sum);

	// for迴圈搭配陣列
	int[] nums = {10, 20, 30};
	for(int i=0; i<nums.length; i++) {
		System.out.println(nums[i]); // 輸出 10 20 30
	}
	
	//更簡潔的寫法
	for(int num:nums) { // 會將nums陣列中的元素，重複指定給變數num
		System.out.println(num); // 輸出 10 20 30
	}
}