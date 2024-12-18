// package basic_note;

// public class break_and_continue {
    
// }

// 迴圈 break continue
void main() {
	
	// break
	for(int i=0; i<10; i++) {
		if(i==5) {
			break; //遇到break就會直接跳出迴圈
		}
		System.out.println(i);
	}
	// 印出
	// 0 1 2 3 4 
	
	// continue
	for(int i=0; i<10; i++) {
		if(i==5) {
			continue; // 不執行下面的程式碼敘述，直接回到迴圈起點繼續執行
		}
		System.out.println(i);
	}
	// 印出
	// 0 1 2 3 4 6 7 8 9
	
	// break 跳出
	// continue 跳過
	
	int i = 0;
	while (i<10) {
		System.out.println(i);
		i++;
	}
	// 印出
	// 0 1 2 3 4 6 7 8 9
	
	// break
	int j = 0;
	while (j<10) {
		if(j==5){
			break;
		}
		System.out.println(j);
		j++;
	}
	// 印出
	// 0 1 2 3 4 
	
	// continue
	int a = 0;
	while (a<10) {
		if(a==5){
			continue;
		}
		System.out.println(a);
		a++;
	}
	// 無窮迴圈（因為到5就會回到開頭 不會再執行到i++ i就停在5）

	int b = 0;
	while (b<10) {
		if(b==5){
			b++;
			continue;
		}
		System.out.println(b);
		b++;
	}
	// 印出
	// 0 1 2 3 4 6 7 8 9

}