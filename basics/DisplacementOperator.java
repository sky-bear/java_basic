public class DisplacementOperator {
  public static void main(String[] args) {
    
    byte a = 1;
    System.out.println(a>>1);
    System.out.println(a<<1);
    System.out.println(a<<2);
    System.out.println(a<<3);
  }
}
//位运算符
// >> 符号位不动，其余位右移，符号位右边补0,又称带符号右移
// >>> 符号位一起右移，左边补0,又称无符号右移
// << 左移

