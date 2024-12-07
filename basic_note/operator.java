// package basic_note;

// public class operator {
    
// }

// 運算符號

// && 且、|| 或、! NOT相反
// == 相等、!= 不相等
// 字串相等比較 使用 .equals()

void main() {
	int age = 20;
	System.out.println(age>10); // 會輸出 true
	System.out.println(30>age>10); // JAVA不能做連續的比較 會出錯
	System.out.println(age>10 && age<30); // (true && true) 兩個都true才是true
	System.out.println(age>10 || age>30); // 有一true就是true
	System.out.println(!true); // 會輸出false
	System.out.println(!(age>10)); // 會輸出false
	System.out.println(age==20); // 會輸出true
	System.out.println(age!=21); // 會輸出true
	
	String name = "abc";
	System.out.println(name.equals("abc")); // 會輸出 true
	System.out.println(name.equals("abcd")); // 會輸出 false
	// 字串用 == != 去比較 有可能會錯
	String name2 = new String("abe");
	System.out.println(name2 == "abc"); // 會輸出false
	System.out.println(name2);
}