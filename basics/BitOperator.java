public class BitOperator {
  public static void main(String[] args) {
    // int a = 05;
    // int b = 011;
    // int c = 0XF;
    // int d = 0X11;
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);


    

    int count1 = 0XF8; // 1111 1000
    int count2 = 0XF4;// 1111  0100
    int count3 = 0XFF; // 1111  1111
    System.out.println(count1);
    System.out.println(count2);
    System.out.println(count3);
    System.out.println(count2 & count1);
    System.out.println(count2 | count1);
    System.out.println(~count3);
  }
}

// 字面值的八进制和十六进制
// 以0开头的整数为八禁止
// 05 就是10进制的 5
// 011 就是 10进制的 9


// 以0X开头的整数为十六进制
// 0XF就是10进制的15
// 0x11就是十进制的17


// 按位运算符
// 按位并（AND）: &
// 按位或（OR）:|
// 按位异或（XOR）：^
// 按位取反：~

