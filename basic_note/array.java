// package basic_note;

// public class array {
    
// }

// array 陣列/數組

void main() {

	// 創建陣列
	String[] names = {"小白", "小黑", "小灰", "小黃"}; // 不能不同的資料型態混著放
	int[] scores = {60, 50, 80, 70};
	double[] heights = {160.5, 170.8, 180.6, 150.7};
	
	System.out.println(names[0]); // 得到小白
	System.out.println(names[4]); // 會出錯
	
	// 另一種創建陣列的方法
	String[] names2 = new String[4];
	// 預計儲存四筆資料 // 先指定陣列的大小，後續在創建資料
	// 優勢在有時候還不知道詳細要儲存的資料有哪些，只知道要幾個值
	names2[0] = "小白";
	names2[1] = "小黑";
	names2[2] = "小灰";
	System.out.println(names2[3]); // 會得到null
	
	int[] scores2 = new int[6];
	scores2[0] = 50;
	scores[1] = 60;
	System.out.println(scores2[0]); // 會得到50
	System.out.println(scores2[2]); // 會得到0

	double[] heights2 = new double[3];
	heights2[0] = 150.3;
	System.out.println(heights2[0]); // 會得到150.3
	System.out.println(heights2[1]); // 會得到0.0
	
	// 修改陣列
	heights[0] = 170.5;
	
	System.out.println(heights[0]); // 會得到 170.5
}