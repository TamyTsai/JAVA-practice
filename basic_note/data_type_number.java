// package basic_note;

// public class data_type_number {
    
// }

// 資料型態 II

// 整數與浮點數尚可再細分，儲存範圍與精準度有差

void main() {

    // 整數
    // byte: -128~127
    // short: -32768~32767
    // int: -2147483648~2147483647
    // long: -9223372036854775808~9223372036854775807
    
    int num1 = 18;
    System.out.println(num1);
    byte num2 = 188;
    System.out.println(num2); // 會發生錯誤
    short num3 = -129;
    System.out.println(num3);
    long num4 = 2200000000L; // 使用long時，要在數字後面加一個L
    // 能儲存越大數字範圍的資料型態，也會佔據更大的電腦空間，所以還是視資料長度 去決定要採甚麼類型的資料型態
    // 最常用的是int
    
    // 浮點數
    // float: 精準到小數點下7位(精準度低，但占用電腦空間少)
    // double: 精準到小數點下15位(精準度高，但占用電腦空間也大)
    
    double num5 = 160.5;
    System.out.println(num5);
    float num6 = 160.5f; // 使用float時，要在數字後面加一個f
    System.out.println(num6);
    // 最常用的是double
    
}