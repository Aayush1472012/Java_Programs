class cast{
  public static void main(String args[])
  {
    byte b;
    int i = 257;
    double d = 323.142;
    System.out.println("COnversion of int to Byte");
    b=(byte)i;//byte is remainder of number divided by 256
    System.out.println("i and b :" + i + " " + b);
    System.out.println("COnversion of double to Byte");
    b=(byte)d;//byte is remainder of number divided by 256
    System.out.println("d and b :" + d + " " + b);
  }
}
