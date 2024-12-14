package basic_note;

public class 2D_array {
	// 2D array 二維陣列
	public static void main() {

		// 陣列裡面再存陣列
		int[][] nums = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		System.out.println(nums[0][0]); // 輸出10
		System.out.println(nums[2][1]); // 輸出80
		
		// 增加可讀性的寫法
		int[][] nums2 = {
							{10, 20, 30}, 
							{40, 50, 60}, 
							{70, 80, 90},
							{10, 20, 30}
						}; // 4x3的二維陣列
		
		// 修改二維陣列值
		nums2[2][1] = 100;
		System.out.println(nums2[2][1]); // 會得到100
		
		// 創建二維陣列的另一種寫法
		int[][] nums3 = new int[2][3];
		nums3[0][0] = 10;
		nums3[0][1] = 20;
		nums3[0][2] = 60;
		nums3[1][0] = 30;
		nums3[1][1] = 40;
		nums3[1][2] = 80;
		// {
		//		{10, 20, 60}, 
		//		{30, 40, 80}, 
		//	}
		
		System.out.println(nums3[0][1]); // 會得到20
		System.out.println(nums2[1][2]); // 會得到80
		
	}

}
