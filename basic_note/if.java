// package basic_note;

// public class if {
    
// }

// if 判斷句

void main() {

	// 如果下雨 就開車去上班
	
	boolean rain = true;
	
	if(rain) { // 若rain為true，就會執行以下程式碼敘述
		System.out.println("開車去上班");
	}


	// 如果下雨 就開車去上班
	// 否則 走路去上班
	
	if(rain) { // 若rain為true，就會執行以下程式碼敘述
		System.out.println("開車去上班");
	} else { // 若rain不為true，就會執行以下程式碼敘述
		System.out.println("走路去上班");
	}


	// 如果大於等於65歲 價格250
	// 或是如果大於18歲 價格300
	// 否則價格 200
	
	int age = 20;
	if (age >= 65) {
		System.out.println("價格250");
	} else if (age > 18) {
		System.out.println("價格300");
	} else {
		System.out.println("價格200");
	}

}