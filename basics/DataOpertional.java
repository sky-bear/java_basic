public class DataOpertional {
  public static void main(String[] args) {
     System.out.println('1');

     byte a = 1;
     byte b = 2;
     a = (byte)(a + 1);
     System.out.println(a);
     System.out.println(b);
     System.out.println(10%-5);

     int aa = 2;
     System.out.println(a);

     boolean a1 = true;
     boolean a2 = false;
     System.out.println(a1 && a2);
     System.out.println(a1 & a2);
     System.out.println(a1 || a2);
     System.out.println(a1 | a2);


     int count1 = 0XF8;
     int count2 = 0XF4;
     int count3 = 0XFF;
     System.out.println(count2 & count1);
     System.out.println(count2 | count1);
     System.out.println(~count3);
  }
}
//  取模运算符
// %
// 整式除法运算
// 比较运算符和布尔运算符
// && 与 & 的区别  ：&& 不进行&& 后半部分的计算； & 会进行后半部计算
// || 与 | 的区别 ：|| 不进行|| 后半部分的计算； | 会进行后半部计算

// 小括号运算符 决定运算的顺序

// 运算符的优先级
//（）
// ！
// * / %
// +-

// 按位运算符
// 按位并（AND）: &
// 按位或（OR）:|
// 按位异或（XOR）：^
// 按位取反：~


