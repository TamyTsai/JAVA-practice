// package basic_note;

// public class variable_concatenation {
    
// }

// 變數串接
void main() {
    String name = "小白";
    System.out.println("有一個人叫" + name);
    // 弱型別最常導致Bug 的情境，除了混用不同型別去數學運算或字串串接，另一個就是允許不同型別之間的比對
    System.out.println(name + "今年25歲");
    System.out.println(name + "身高152公分");
    System.out.println("剛剛" + name + "去上廁所");
}